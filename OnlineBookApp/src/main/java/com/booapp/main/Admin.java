package com.booapp.main;

import com.bookapp.exception.IDNotfoundException;
import com.bookapp.model.Book;
import com.bookapp.service.BookService;
import com.bookapp.service.BookServiceImpl;

public class Admin {

	public static void main(String[] args) throws IDNotfoundException {
		//Book book = new Book("Python in action", 11, "Jhon", "tech", 780.0);
		BookService service = new BookServiceImpl();
	//	service.addBook(book);
		
		service.deletebook(11);
		System.out.println();
		/*
		 * try { service.updateBook(11, 900); } catch (IDNotfoundException e) {
		 * System.out.println(e.getMessage()); }
		 */
	}

}
