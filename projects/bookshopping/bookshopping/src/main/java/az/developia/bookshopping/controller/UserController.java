package az.developia.bookshopping.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import az.developia.bookshopping.model.User;

@Controller
public class UserController {
	private boolean createUser = false;

	@GetMapping(path = "/show-login")
	public String showLoginPage(Model model) {
		if (createUser) {
			model.addAttribute("userCreated", "");
			createUser=false;
		}
		return "my-custom-login";
	}

	@GetMapping(path = "/create-account")
	public String showSignUpPage(Model model) {
		User user = new User();
		model.addAttribute("user", user);
		return "create-account";
	}

	@PostMapping(path = "/create-account-process")
	public String saveBook(@Valid @ModelAttribute(name = "user") User user, BindingResult result, Model model) {
		if (result.hasErrors()) {
			return "create-account";
			
		}
		createUser = true;
		return "redirect:/show-login";
	}
}
