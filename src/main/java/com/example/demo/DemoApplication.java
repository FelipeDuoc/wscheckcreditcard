package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.domain.CardValidationResult;
import com.example.demo.domain.RegexCardValidator;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		
		String visa = "4444444444444448";
        String master = "5500005555555559";
        String amex = "371449635398431";
        String diners = "36438936438936";
        String discover = "6011016011016011";
        String jcb = "3566003566003566";
        String luhnFail = "1111111111111111";
        
        String invalid = "abcdabcdabcdabcd";
        
        printTest(visa);
        printTest(master);
        printTest(amex);
        printTest(diners);
        printTest(discover);
        printTest(jcb);
        printTest(invalid);
        printTest(luhnFail);
	}
	
	/**
     * Check a card number and print the result
     * @param cardIn
     */
    private static void printTest(String cardIn) {
        CardValidationResult result = RegexCardValidator.isValid(cardIn);
        System.out.println(result.isValid() + " : " + (result.isValid()? result.getCardType().getIssuerName(): "")  + " : " + result.getMessage() );
    }
}
