package com.example.demo.entry;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
public class ViewDispather {
	@RequestMapping (value="/{name}", method=RequestMethod.GET)
	public String ViewsPath(@PathVariable String name, ModelMap model) {
		return name!=null?name:"index";
	}
}
