package com.example.Payment_Gateway.Dao;



import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.Payment_Gateway.Dto.Payment;
import com.example.Payment_Gateway.Repo.PaymentRepo;

@Repository
public class PaymentDao {

	@Autowired
	private PaymentRepo paymentRepo;

	public Payment initiatePayment(Payment payment) {
		return paymentRepo.save(payment);
	}
	
	public Payment checkStatus(int delarId) {
		Optional<Payment> payment =paymentRepo.findByDealerId(delarId);
		return payment.get();
	}
	
	 
}