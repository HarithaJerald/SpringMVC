package com.ust;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MVCController {
	
	@RequestMapping("/add")
	public void add() {
		System.out.println("i'm here");
	}
}
