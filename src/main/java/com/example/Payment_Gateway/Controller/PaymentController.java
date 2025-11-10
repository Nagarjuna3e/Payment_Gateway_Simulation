package com.example.Payment_Gateway.Controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Payment_Gateway.Dto.Payment;

import com.example.Payment_Gateway.Service.PaymentService;

@RestController
@RequestMapping("/api/payment")
public class PaymentController {
	
	
	@Autowired
	private PaymentService paymentService;

	
	@PostMapping("/initiate")
	public Payment ininitiatePayment(@RequestBody Payment payment) {
		return paymentService.initiatePayment(payment);
	}
	
	@GetMapping("/checkStatus")
	public Payment checkStatus(@RequestParam int dealerId) {
		return paymentService.checkStatus(dealerId);
		
	}
}
