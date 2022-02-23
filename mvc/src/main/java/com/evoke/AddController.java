package com.evoke;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.evoke.employee.Employee;
import com.evoke.service.AddService;

@Controller
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
		obj2.setViewName("view");
	//	obj2.addObject("name",name);
	//obj2.addObject("phone", phone);
	//	obj2.addObject("email", email);
		Employee employee=new Employee();
		employee.setName(name);
		employee.setPhone(phone);
		employee.setEmail(email);
		
		obj2.addObject("employee", employee);
		
		
		return obj2;
		
	}
	@RequestMapping("/show")
	public String show(@ModelAttribute Employee employee,Model  model) {
		return "view";
	}
	
	
	
	
    @RequestMapping("/list")
	public String data(Model model) {
    	List<String> list=new ArrayList();
    	list.add("ram");
    	list.add("john");
    	list.add("shyam");
    	
    	model.addAttribute("names", list);
    	
    	return "details";
		
	}
}
