package com.cry.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class T1Controller {

	@RequestMapping("/")
	public String index() {


		return "t1";
	}

}