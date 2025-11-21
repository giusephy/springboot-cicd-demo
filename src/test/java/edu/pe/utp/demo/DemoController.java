package edu.pe.utp.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	 @GetMapping("/info")
	    public String hello() {
	        return "Info desde CI/CD!";
	    }
}
