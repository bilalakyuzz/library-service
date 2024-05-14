package com.example.bookservice.service.concretes;

import com.example.bookservice.entities.Book;
import com.example.bookservice.entities.Genre;
import com.example.bookservice.service.abstracts.BookService;
import com.example.bookservice.service.abstracts.GenreService;
import com.example.bookservice.service.dto.response.FindBookByIdResponse;
import com.example.bookservice.service.mapper.BookMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.example.bookservice.repository.BookRepository;

import java.util.List;

@RequiredArgsConstructor
@Service


public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;
    private final GenreService genreService;
    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public FindBookByIdResponse findById(int id) {
        Book book = bookRepository.findById(id).orElseThrow(()->new RuntimeException("no book with the id"));
        return BookMapper.INSTANCE.getBookResponseFromBook(book);
    }

    @Override
    public Book save(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public void deleteById(int id) {
        bookRepository.deleteById(id);
    }

    @Override
    public Book update(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public Book updateBookGenreId(int id, int genreId) {
        Book book= bookRepository.findById(id).orElseThrow(()->new RuntimeException("no book with the id"));
        Genre genre= genreService.findById(genreId);
        book.setGenre(genre);
        return bookRepository.save(book);
    }
}
