package com.yang.book.service.impl;

import com.yang.book.dao.BookMapper;
import com.yang.book.entity.Books;
import com.yang.book.service.BookSeriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookSeriver {

    @Autowired
    private BookMapper bookMapper;

    @Override
    public Integer addBook(Books book) {
        return bookMapper.addBook(book);
    }

    @Override
    public Integer deleteBookById(Integer id) {
        return bookMapper.deleteBookById(id);
    }

    @Override
    public Integer updateBook(Books books) {
        return bookMapper.updateBook(books);
    }

    @Override
    public Books findById(Integer id) {
        return bookMapper.findById(id);
    }

    @Override
    public List<Books> findAll(Books books) {
        return bookMapper.findAll(books);
    }
}
