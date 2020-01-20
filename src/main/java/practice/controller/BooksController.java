package practice.controller;

import java.util.List;

import javax.swing.text.html.FormSubmitEvent.MethodType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import practice.Book;
import practice.service.BookService;

@RestController
public class BooksController {
	
	@Autowired
	private BookService bookService;

	@RequestMapping("/books")
	public List<Book> getBooks() {
	
		return bookService.getBooks();
	}
	
	@RequestMapping( method=RequestMethod.POST ,value="/books")
	public void  addBook(@RequestBody Book book) {
	
		bookService.addBook(book);
	
	}
	
	@RequestMapping("/books/{id}")
	public Book getBook( @PathVariable int id) {
		return bookService.getBook(id);
		
	}
}
