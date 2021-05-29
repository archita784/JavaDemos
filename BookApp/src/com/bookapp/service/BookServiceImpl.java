package com.bookapp.service;

import java.util.ArrayList;
import java.util.List;

import com.bookapp.exception.BookNotfound;
import com.bookapp.model.Book;

public class BookServiceImpl implements BookSevice {
List <Book> bookList=new ArrayList<Book>();
	@Override
	public void addBook(Book book) {
		bookList.add(book);
		
	}

	@Override
	public List<Book> getBookByAuthor(String author) throws BookNotfound {
		List<Book> booksByAuthor = new ArrayList<>();
		for (Book book : bookList) {
			if (book.getAuthor().equals(author))
				booksByAuthor.add(book);
		}
		if (booksByAuthor.isEmpty())
			throw new BookNotfound("Book by author not available");
		return booksByAuthor;
	}

	@Override
	public Book getbyId(int id) throws BookNotfound {
		for (Book book : bookList) {
			if(book.getBookid()==id)
				return book;
		}
		throw new BookNotfound("Book by this id not available");
	
	}

	@Override
	public List<Book> getAllBooks() {
		return bookList;
	}
	

}
