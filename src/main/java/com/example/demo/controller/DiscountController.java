package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class DiscountController {

	@Value("${descuento}")
	private double descuento;

	@GetMapping("/descuento")
	public String obtenerDescuento() {
		return "El descuento actual es: " + descuento + "%";
	}
}
