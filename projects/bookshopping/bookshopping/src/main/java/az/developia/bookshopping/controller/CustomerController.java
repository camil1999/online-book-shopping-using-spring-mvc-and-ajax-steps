package az.developia.bookshopping.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CustomerController {

	@GetMapping(path = "/customer")
	public String showoCustomerPage() {

		return "customer";
	}

}
