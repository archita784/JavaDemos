package com.bookapp.testcases;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.platform.runner.JUnitPlatform;

import com.bookapp.exceptions.BookNotfoundException;
import com.bookapp.model.Book;
import com.bookapp.service.BookServiceImpl;

class TestBook {

	@RunWith(JUnitPlatform.class)
	public class BookTest {

		List<Book> bookList;
		Book book1, book2, book3, book4;
		BookServiceImpl service;

		@BeforeEach
		public void setup() {
			service = new BookServiceImpl();

			book1 = new Book("java", 9, "jhon", "tech", 900);
			book2 = new Book("python in action", 8, "Monk", "tech", 800);
			book3 = new Book("Spring", 8, "Monk", "tech", 800);
			book4 = new Book("Html", 8, "Monk", "tech", 800);
			bookList = Arrays.asList(book1, book2, book3, book4);
		}

		@Test
		@Disabled
		public void testAddBook(){
			Book book = new Book("java", 9, "jhon", "tech", 900);
			service.addBook(book);
			int origSize = service.getAllBooks().size();
			book = new Book("java", 9, "jhon", "tech", 900);
			service.addBook(book);
			
			assertEquals(2, service.getAllBooks().size());
			
		}
		@Test
		public void testBooksByAuthor() throws BookNotfoundException{
			service.getBookByAuthor(bookList);
			List<Book> booksByAuthor = service.getBookByAuthor("Kathy");
			assertEquals(2,booksByAuthor.size());
			
		}
		@Test
		public void testNoBooksByAuthor() throws BookNotfoundException{
			service.getBookByAuthor(bookList);
			assertThrows(BookNotfoundException.class, ()->{
				List<Book> booksByAuthor = service.getBookByAuthor("Kathyee");
			});
			}
			
		
		
		@AfterEach
		public void teardown(){
			service=null;
			bookList=null;
		}


	}
}