package com.java.SpringWebApplication.Controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@ComponentScan(basePackages="com.java.SpringWebApplication")
@Controller
public class SampleController {
	@RequestMapping(value="/name",method = RequestMethod.GET)
	public String showMyName()
	{
		return "balu";
	}

}
