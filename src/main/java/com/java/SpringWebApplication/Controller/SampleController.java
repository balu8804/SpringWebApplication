package com.java.SpringWebApplication.Controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;



//@ComponentScan(basePackages="com.java.SpringWebApplication")
@Controller
public class SampleController {
    private static final Logger logger = Logger.getLogger(SampleController.class);

	
	@RequestMapping(value="/name",method = RequestMethod.GET)
	public String showMyName(@RequestParam(value="id") String id)
	{
		System.out.println("This is sample controller class");
		System.out.println("Id is: "+id);
		logger.info("Id is: "+id);
		return "balu";
	}

}
