package com.sujin.pbdw;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Test {
	@RequestMapping("/")
	@ResponseBody
	public String home() {
		return "test";
	}
}