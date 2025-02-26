package az.developia.spring_project_2sentyabr.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import az.developia.spring_project_2sentyabr.entity.Book;

@Controller
public class BookController {

	@GetMapping(path="/book")
	public String showBook(Model model) {
		List<Book> books = new ArrayList<Book>();
		books.add(new Book(41, "Chess", 4.7, 82));
		books.add(new Book(42, "1984", 9.8, 394));
		books.add(new Book(43, "Martin Eden", 8.3, 387));
		model.addAttribute("books",books);
		return "book";
	}
}
