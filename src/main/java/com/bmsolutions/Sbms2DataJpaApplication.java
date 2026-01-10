package com.bmsolutions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bmsolutions.entity.Book;
import com.bmsolutions.repository.BookRepository;

@SpringBootApplication
public class Sbms2DataJpaApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Sbms2DataJpaApplication.class, args);
	}
	
	@Autowired
	BookRepository bookRepository;

	@Override
	public void run(String... args) throws Exception {  //automatic call when application starts
		
//		Book b = new Book(2, "Python", 4000, 5);
//		
//		bookRepository.save(b);
		
		Iterable<Book> books = bookRepository.findAll();
		books.forEach(b->System.err.println(b));
	}

}
