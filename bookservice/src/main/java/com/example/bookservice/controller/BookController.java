package com.example.bookservice.controller;

import com.example.bookservice.entities.Book;
import com.example.bookservice.service.dto.requests.AddBookRequest;
import com.example.bookservice.service.dto.response.FindBookByIdResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.example.bookservice.service.abstracts.BookService;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/books")
public class BookController {
    private final BookService bookService;
    @GetMapping
    public List<Book> getAllBooks() {
        return bookService.findAll();
    }
    @PostMapping("/add")
    public Book addBook(@RequestBody AddBookRequest addBookRequest) {
        return bookService.save(addBookRequest);
    }
    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable int id) {
        bookService.deleteById(id);
    }
    @GetMapping("/findById/{id}")
    public FindBookByIdResponse findById(@PathVariable int id) {
        return bookService.findById(id);
    }
    @PutMapping("{id}/{genreId}")
    public Book updateBookGenreId(@PathVariable int id,@PathVariable int genreId) {
        return bookService.updateBookGenreId(id,genreId);
    }

}
