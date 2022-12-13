package az.developia.bookshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

	@GetMapping(path ="/show-login")
	public String showLoginPage() {

		return "my-custom-login";
	}
}
