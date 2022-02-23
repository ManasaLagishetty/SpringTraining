package com.evoke;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.evoke.service.AddService;

public class AddController {
	
	@RequestMapping("/add")
	public ModelAndView add(@RequestParam("num1") int i, @RequestParam("num2") int j) {
		
		
	//	int i=Integer.parseInt(request.getParameter("num1"));
	//	int j=Integer.parseInt(request.getParameter("num2"));
		AddService service=new AddService();
		int k=service.add(i, j);
		
		ModelAndView obj=new ModelAndView();
		obj.setViewName("show");
		obj.addObject("result", k);
		
		return obj;

	}
	
	@RequestMapping("/Register")
	public ModelAndView showDetails(@RequestParam("name") String name, @RequestParam("phone") int phone, @RequestParam("email") String email) {
		ModelAndView obj2=new ModelAndView();
		obj2.setViewName("view.jsp");
		obj2.addObject("name",name);
		obj2.addObject("phone", phone);
		obj2.addObject("email", email);
		
		return obj2;
		
	}

}
