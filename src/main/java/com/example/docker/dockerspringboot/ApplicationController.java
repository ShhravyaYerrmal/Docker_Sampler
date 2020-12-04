package com.example.docker.dockerspringboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ApplicationController {
	@ResponseBody
	@RequestMapping("/docker/hello")
	  public String home() {
	    return "Hello Docker World";
	  }


}
