package com.sat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
	public class Homepage {
		@GetMapping("/homepage")
		public String homepage () {
		return"homepage";
}
	}

