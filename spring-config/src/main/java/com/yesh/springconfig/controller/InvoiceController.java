package com.yesh.springconfig.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InvoiceController {
	
	@GetMapping("/invoices")
	public String invoiceHome()
	{
		return "home";
	}

}
