package az.developia.bookshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@RequestMapping(path="/home")
@Controller
public class HomeController {

	@GetMapping
	public String showHomePage() {
		
		
		return "home";
	}
}
