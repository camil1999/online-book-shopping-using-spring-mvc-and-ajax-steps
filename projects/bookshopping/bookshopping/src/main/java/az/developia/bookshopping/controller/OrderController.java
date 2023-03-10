package az.developia.bookshopping.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OrderController {

	@GetMapping(path = "/orders")
	public String showoOrdersPage() {

		return "orders";
	}
	
	@GetMapping(path = "/confirm-order")
	public String showoConfirmOrderPage() {

		return "confirm-order";
	}

}
