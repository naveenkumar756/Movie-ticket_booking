package com.sat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Bookinghistory {
	@GetMapping("/bookinghistory")
	public String bookinghistory() {
		return "bookinghistory";
		 
	}
	}


