package com.firstSpringBoot.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {
		@RequestMapping("/hello")
		public String sayHi() {
			
			//Showing the output by the server
			return "Hi user!...";
		}
}
