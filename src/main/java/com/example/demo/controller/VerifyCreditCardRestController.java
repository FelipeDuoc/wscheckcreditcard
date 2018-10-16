package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.CardValidationResult;
import com.example.demo.domain.RegexCardValidator;
import com.example.demo.domain.Response;

@RestController
public class VerifyCreditCardRestController {
	
	@GetMapping("/checkid")
	public Response checkCreditCard(@RequestParam(value="idCard")String idCard) {
		Response resp = new Response();
		System.out.println("Validando tarjeta: "+idCard);
		System.out.println("...........................");
		CardValidationResult result = RegexCardValidator.isValid(idCard);
		resp.setIsvalid(result.isValid());
		System.out.println("Resultado: "+resp.getIsvalid());
		System.out.println("**************************");
		
		return resp;
	}
}
