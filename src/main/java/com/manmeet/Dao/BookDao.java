package com.manmeet.Dao;

import com.manmeet.Entity.Book;

import java.util.Collection;

/**
 * Created by manmeet on 8/1/16.
 */
public interface BookDao {
    Collection<Book> getAllBooks();

    Book getBookById(int id);

    void removeBookById(int id);

    void updateBookByObj(Book book);

    void insertBook(Book book);
}
