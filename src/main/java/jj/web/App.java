package jj.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Hello world!
 *
 */
@RestController
@EnableAutoConfiguration
public class App 
{
	@RequestMapping("/j")
	String joel() {
		return "joel";
	}
    public static void main( String[] args )
    {
    	SpringApplication.run(App.class, args);
    }
}
