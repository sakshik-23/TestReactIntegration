package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class TestController {
	
	@RequestMapping(value = "/")
    public String forward() {
		System.out.println("Controller called");
        return "forward:/index.html";
    }

}
