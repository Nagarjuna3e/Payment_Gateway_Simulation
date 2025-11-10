package com.example.Payment_Gateway.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Payment_Gateway.Dao.PaymentDao;
import com.example.Payment_Gateway.Dto.Payment;
import com.example.Payment_Gateway.Exception.PaymentFaildException;
import com.example.Payment_Gateway.Repo.PaymentRepo;

@Service
public class PaymentService {
	
	@Autowired
	private PaymentDao paymentDao;

	@Autowired
	private PaymentRepo paymentRepo;
	
	public Payment initiatePayment(Payment payment) {
		
		
		if (payment.getDealerId()==0 ) {
	        throw new PaymentFaildException("Dealer ID cannot be null.");
	    }

	    if (payment.getAmount() <= 0) {
	        throw new PaymentFaildException("Payment amount must be greater than zero.");
	    }
		
        payment.setStatus("PENDING");
        Payment savedPayment = paymentDao.initiatePayment(payment);
        System.out.println("Payment pending for dealer ID: " + savedPayment.getDealerId());

        Thread t = new Thread() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5000); 
                    savedPayment.setStatus("SUCCESS");
                    paymentDao.initiatePayment(savedPayment); 
                    System.out.println("Payment successful for dealer ID: " + savedPayment.getDealerId());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        t.start();
        return savedPayment;
        
    }
	
	public Payment checkStatus(int dealerId) {
		 Optional<Payment> payment = paymentRepo.findByDealerId(dealerId);
		if (payment.isEmpty() ) {
	        throw new PaymentFaildException("pleasce Check your dealer Id");
	    }
		return paymentDao.checkStatus(dealerId);
		
	}
	
}
