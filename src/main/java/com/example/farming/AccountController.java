package com.example.farming;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class AccountController {
@GetMapping(path="/microdetails")
	public boolean Accountdetails(@RequestParam String accId) {
		if(accId!=null) {
			if(accId.substring(0,2).equals("01")) {
				return true;
			}
		}return false;
	}
 
}


