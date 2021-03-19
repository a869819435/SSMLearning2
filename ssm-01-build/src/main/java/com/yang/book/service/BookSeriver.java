package com.yang.book.service;

import com.yang.book.entity.Books;

import java.util.List;

public interface BookSeriver {

    Integer addBook(Books book);

    Integer deleteBookById(Integer id);

    Integer updateBook(Books books);

    Books findById(Integer id);

    List<Books> findAll();
}
