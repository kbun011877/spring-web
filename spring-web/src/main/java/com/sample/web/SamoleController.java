package com.sample.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sample")
public class SamoleController {

	@RequestMapping("/main.do")
	public String sample() {
		return "sample/main";
	}
	
	public String master() {
		return "master";
	}
	public String bugfix() {
		return "bugfix";
	}
	
}
