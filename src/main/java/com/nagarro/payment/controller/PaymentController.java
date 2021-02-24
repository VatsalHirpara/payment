package com.nagarro.payment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payments")
public class PaymentController {

	@GetMapping("/{customerId}")
	public boolean getPaymentStatus(Long customerId) {
		return true;
	}
}
