package az.developia.bookshopping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import az.developia.bookshopping.dao.BookDAO;
import az.developia.bookshopping.model.Book;

@RequestMapping(path = "/books")
@Controller
public class BookController {
	@Autowired
	private BookDAO bookDAO;

	@GetMapping
	public String showBooks(Model model) {
		List<Book> books = bookDAO.findAll();
		model.addAttribute("books", books);
		return "books";
	}

	@GetMapping(path = "/new-book")
	public String openNewBookPage(Model model) {
		Book book = new Book();
		model.addAttribute("book", book);
		return "new-book";
	}
	

	@PostMapping(path = "/new-book-process")
	public String saveBook(@ModelAttribute(name = "book") Book book, Model model) {
		book.setImage("book.jpg");
		book.setUsername("jamil");
		bookDAO.save(book);
		List<Book> books = bookDAO.findAll();
		model.addAttribute("books", books);

		return "redirect:/books";
	}
	@GetMapping(path = "/books/delete/{id}")
	public String deleteBook(@PathVariable(name="id")Integer id,Model model) {
		
		return "books";
	}

}
