package com.ust;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController {
	
	@RequestMapping("/add")
	public ModelAndView add(@RequestParam("t1") int i, @RequestParam("t2") int j) {
		int k = i + j;
		ModelAndView model = new ModelAndView();
		model.setViewName("result");
		model.addObject("result",	k);
		return model;
	}
}
