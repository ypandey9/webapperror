package com.greatlearning.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //steriotype annotation of @Component
public class HelloController {

	//Adding request mapping  -->URL
	@RequestMapping("/")
	public String giveWelcomeMessage()
	{
		return "welcome";
	}
	//Adding request mapping  -->URL
	@RequestMapping("/hello")
	public String giveHelloMessage()
	{
		return "hello";
	}
}
