package com.hll.end;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloCtrl {
	@RequestMapping(value = "/hello")
	public String hello() {
		return "hello world!";
		
	}
}
