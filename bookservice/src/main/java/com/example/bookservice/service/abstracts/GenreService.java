package com.example.bookservice.service.abstracts;

import com.example.bookservice.entities.Genre;

import java.util.List;

public interface GenreService {
    void save(Genre genre);
    Genre findById(int id);
    List<Genre> findAll();
    void delete(int id);
    void update(Genre genre);
}
