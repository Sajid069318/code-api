package com.code.mywork;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@ComponentScan
@RestController
public class Controller {

	@RequestMapping("/hello")
	public String test() {
		return "hi";
	}
}
