package com.example.Payment_Gateway.Repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Payment_Gateway.Dto.Payment;

public interface PaymentRepo  extends JpaRepository<Payment, Integer>{
	Optional<Payment> findByDealerId(int dealerId);

}
