package com.jeff;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller
@SpringBootApplication
public class ThymeleafApplication {



	@RequestMapping("/")

//	This is modeling the object.  This object will be passed on to the HTML file in the templates folder
	public String home(Model model) {
		model.addAttribute("author","Jethrow");
		model.addAttribute("height","6'2");
		List favoriteFood = Arrays.asList("pizza","tacos","ice cream");
		model.addAttribute("favoriteFood",favoriteFood);
		return "index.html";
	}

	public static void main(String[] args) {
		SpringApplication.run(ThymeleafApplication.class, args);
	}
}
