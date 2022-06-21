package com.rabbydu.githubcicd;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {

	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome to rabbydu 2";
	}
}
