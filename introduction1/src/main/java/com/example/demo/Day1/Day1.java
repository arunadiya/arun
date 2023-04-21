package com.example.demo.Day1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Day1 {
	@GetMapping("/hi")
	@ResponseBody
	public String hi() {
		return"welcome";
	}
}
