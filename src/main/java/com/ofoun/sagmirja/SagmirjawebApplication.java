package com.ofoun.sagmirja;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@SpringBootApplication
public class SagmirjawebApplication {

	public static void main(String[] args) {
		SpringApplication.run(SagmirjawebApplication.class, args);
	}

//	@RestController
//	@RequestMapping("/")
//	static class HomeController {
//		@GetMapping
//		String showTimestamp() {
//			return LocalDateTime.now().toString();
//		}
//	}
	
	
	@Controller
//	@RequestMapping("/")
	public class HomeController {
		@GetMapping("/")
		public String viewHomePage() {
						
			return "index";
			
		}
	}
	


}
