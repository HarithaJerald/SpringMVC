package com.ust;  
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;  
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;  
@Controller  
public class HelloController {  

	@RequestMapping("/add")  
    public ModelAndView add(@RequestParam("t1") int i, @RequestParam("t2") int j,HttpServletRequest request, HttpServletResponse response)  
    {  
		
//		<-- instead of this we can use @RequestParam annotation -->
		
//		int i = Integer.parseInt(request.getParameter("t1"));
//		int j = Integer.parseInt(request.getParameter("t2"));
		
		
		
		AddService s = new AddService();
		int k =  s.add(i, j);	
		ModelAndView mv = new ModelAndView();
//		mv.setViewName("display.jsp");
		mv.setViewName("display");
		mv.addObject("result",k);
		return mv;
    }     
}  