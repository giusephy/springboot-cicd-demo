package edu.pe.utp.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	 @GetMapping("/info")
	    public String info() {
	        return "Mensaje desde controller CI/CD!";
	    }
}
