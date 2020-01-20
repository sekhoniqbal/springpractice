package practice.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.Repository;
import org.springframework.stereotype.Service;

import practice.Book;
import practice.repository.BookRepository;

@Service
public class BookService {
	
	@Autowired
	private BookRepository repo;
	private int id = 100;
	
	public List<Book> getBooks() {
		
		List<Book> books = new ArrayList<Book>();
		repo.findAll().forEach(books::add);
		return books;
		
		
	}
	
	public void addBook(Book book) {
		//book.id =id++;
		repo.save(book);
		
	}

	public Book getBook(int id) {
		
		return repo.findById(id).get();
	}

}
