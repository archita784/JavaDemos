package com.bookapp.service;

import java.util.List;

import com.bookapp.exception.BookNotfound;
import com.bookapp.model.Book;

public interface BookSevice {
	void addBook(Book book);
    List<Book> getBookByAuthor(String author) throws BookNotfound;
    Book getbyId(int id)throws BookNotfound;
    List<Book> getAllBooks();
    
}