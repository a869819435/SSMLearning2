package com.yang.book.controller;

import com.yang.book.entity.Books;
import com.yang.book.service.BookSeriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookSeriver bookService;

    @RequestMapping("/allBook")
    public String list(Model model) {
        List<Books> list = bookService.findAll();
        model.addAttribute("list", list);
        return "allbook";
    }
}
