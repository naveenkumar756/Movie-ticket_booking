package com.sat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Paymentmethods {
@GetMapping("/paymentmethods")
public String paymentmethods() {
	return "Paymentmethods";
}
}
