package com.manmeet.Dao;

// Representation of a db table using a static db in this case (for now). Contains methods to alter
// each enttity.

import com.manmeet.Entity.Book;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
import java.util.Collection;

@Repository
public class BookDao {
    private static Map<Integer, Book> books;

    static {
        books = new HashMap<Integer, Book>(){
            {
                put(1, new Book(1, "Said", "Computer Science"));
                put(2, new Book(2, "Alex U", "Finance"));
                put(3, new Book(3, "Anna", "Maths"));
            }

        };
    }

    public Collection<Book> getAllBooks()
    {

        return this.books.values();
    }

    public Book getBookById(int id){

        return this.books.get(id);
    }

    public void removeBookById(int id) {
        this.books.remove(id);
    }

    public void updateBookByObj(Book book){
        Book b = books.get(book.getId());
        b.setCourse(book.getCourse());
        b.setName (book.getName());
        this.books.put(book.getId(), book);
    }

    public void insertBook (Book book){
        this.books.put(book.getId(), book);
    }
}
