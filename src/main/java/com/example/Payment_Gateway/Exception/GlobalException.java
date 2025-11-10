package com.example.Payment_Gateway.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice
public class GlobalException {

	
	@ExceptionHandler(PaymentFaildException.class)
	public ResponseEntity<String> faildPayment(PaymentFaildException exception){
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(exception.getMessage());
		
	}
}
