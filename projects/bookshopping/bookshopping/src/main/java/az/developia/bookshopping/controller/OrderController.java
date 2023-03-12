package az.developia.bookshopping.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import az.developia.bookshopping.config.MySession;
import az.developia.bookshopping.dao.CustomerDAO;
import az.developia.bookshopping.dao.OrderDAO;
import az.developia.bookshopping.model.Customer;
import az.developia.bookshopping.model.Order;
import az.developia.bookshopping.service.OrderService;

@Controller
public class OrderController {
	@Autowired
	private MySession mySession;

	@Autowired
	private OrderService orderService;

	@Autowired
	private OrderDAO orderDAO;

	@Autowired
	private CustomerDAO customerDAO;

	@GetMapping(path = "/orders")
	public String showoOrdersPage(Model model) {
		List<Order> order = orderDAO.findByUsername(mySession.getUsername());
		model.addAttribute("orders", order);
		return "orders";
	}

	@GetMapping(path = "/confirm-order")
	public String showoConfirmOrderPage(Model model) {
		Customer customer = new Customer();
		model.addAttribute("customer", customer);
		return "confirm-order";
	}

	@GetMapping(path = "/order-confirmation-message")
	public String showoOrderConfirmationPage() {

		return "order-confirmation-message";
	}

	@PostMapping(path = "/confirm-order-process")
	public String confirmOrderProcess(@Valid @ModelAttribute(name = "customer") Customer customer, BindingResult br) {
		if (br.hasErrors()) {
			return "confirm-order";
		}
		Customer customerFindByPhone = customerDAO.findByPhone(customer.getPhone());
		if (customerFindByPhone == null) {

		} else {
			Integer id=customerFindByPhone.getId();
			customer.setId(id);
			customerDAO.save(customer);
			customer=customerDAO.findById(id).get();
		}
		orderService.save(customer);
		return "redirect:/order-confirmation-message";
	}

}
