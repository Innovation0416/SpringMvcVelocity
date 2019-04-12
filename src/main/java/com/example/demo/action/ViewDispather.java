package com.example.demo.action;


import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Component
public class ViewDispather {
	@RequestMapping (value="/{name}", method=RequestMethod.GET)
	public String ViewsPath(@PathVariable String name, ModelMap model) {
		return name;
	}
}
