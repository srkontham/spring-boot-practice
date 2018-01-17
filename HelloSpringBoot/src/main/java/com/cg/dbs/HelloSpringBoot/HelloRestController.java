package com.cg.dbs.HelloSpringBoot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {

	@RequestMapping("/hello")
	public String hello() {
		return "Hello. All your base are belong to us.";
	}
}
