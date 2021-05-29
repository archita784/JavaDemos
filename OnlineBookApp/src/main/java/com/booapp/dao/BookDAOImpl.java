package com.booapp.dao;


import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.bookapp.model.Book;

public class BookDAOImpl implements BookDAO {

	static SessionFactory factory;
	static {
		factory = hibernateUtil.getSessionFactory();
	}

	public void addOneBook(Book book) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		Integer bookId = (Integer) session.save(book);
		System.out.println("Inserted " + bookId);
		transaction.commit();
		session.close();

	}

	public int updateOneBook(int bookid, double price) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		Book book = session.get(Book.class, bookid);
		book.setPrice(price);
		session.update(book);
		transaction.commit();
		session.close();
		return 1;

	}

	public int deleteOnebook(int bookid) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.delete(bookid);
		transaction.commit();
		session.close();
		return 1;
	}

	public List<Book> findAllBooks() {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		Query<Book> query = session.createQuery("from Book");
		List<Book> bookList = new ArrayList<>();
		bookList = query.list();
		transaction.commit();
		session.close();
		return bookList;
	}

	public List<Book> findBookByAuthor(String author) {

		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		String sql = "from Book b where b.author like :choice";
		Query<Book> query = session.createQuery(sql).setParameter("choice", author);
		List<Book> bookList = new ArrayList<>();
		bookList = query.list();
		transaction.commit();
		session.close();
		return bookList;
	}

	public List<Book> findBookBycategory(String category) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		String sql = "from Book b where b.category like :choice";
		Query<Book> query = session.createQuery(sql).setParameter("choice", category);
		List<Book> bookList = new ArrayList<>();
		bookList = query.list();
		transaction.commit();
		session.close();
		return bookList;
	}

	@Override
	public Book findBookById(int bookid) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		Book book = session.get(Book.class, bookid);
		transaction.commit();
		session.close();
		return book;
	}
}