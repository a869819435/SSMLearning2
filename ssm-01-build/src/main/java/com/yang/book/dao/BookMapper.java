package com.yang.book.dao;

import com.yang.book.entity.Books;

import java.util.List;

public interface BookMapper {

    Integer addBook(Books books);

    Integer deleteBookById(Integer id);

    Integer updateBook(Books books);

    Books findById(Integer id);

    List<Books> findAll(Books books);
}
