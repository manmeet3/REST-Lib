package com.manmeet.Service;

import com.manmeet.Dao.BookDao;
import com.manmeet.Entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class BookService {

    @Autowired
    private BookDao bookDao;

    public Collection<Book> getAllBooks()
    {
        return this.bookDao.getAllBooks();
    }

    public Book getBookById(int id){
        return this.bookDao.getBookById(id);
    }

    public void removeBookById(int id) {
        this.bookDao.removeBookById(id);
    }

    public void updateBookByObj(Book book){
        this.bookDao.updateBookByObj(book);

    }

    public void insertBook(Book book) {
        this.bookDao.insertBook(book);
    }
}
