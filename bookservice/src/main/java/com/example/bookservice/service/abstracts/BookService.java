package com.example.bookservice.service.abstracts;

import com.example.bookservice.entities.Book;
import com.example.bookservice.service.dto.requests.AddBookRequest;
import com.example.bookservice.service.dto.response.FindBookByIdResponse;

import java.util.List;


public interface BookService {
    List<Book> findAll();
    FindBookByIdResponse findById(int id);
    Book save(AddBookRequest addBookRequest);
    void deleteById(int id);
    Book update(Book book);

    Book updateBookGenreId(int id, int genreId);
}
