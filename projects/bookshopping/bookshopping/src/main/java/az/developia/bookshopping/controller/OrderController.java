package az.developia.bookshopping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import az.developia.bookshopping.config.MySession;
import az.developia.bookshopping.dao.OrderDAO;
import az.developia.bookshopping.model.Order;

@Controller
public class OrderController {
	@Autowired
	private MySession mySession;

	@Autowired
	private OrderDAO orderDAO;

	@GetMapping(path = "/orders")
	public String showoOrdersPage(Model model) {
		List<Order> order = orderDAO.findByUsername(mySession.getUsername());
		model.addAttribute("orders", order);
		return "orders";
	}

	@GetMapping(path = "/confirm-order")
	public String showoConfirmOrderPage() {

		return "confirm-order";
	}

}
