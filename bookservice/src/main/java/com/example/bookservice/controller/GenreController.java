package com.example.bookservice.controller;

import com.example.bookservice.entities.Genre;
import com.example.bookservice.service.abstracts.GenreService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/genre")
@RequiredArgsConstructor
public class GenreController {
    private final GenreService genreService;
    @GetMapping
    public Genre getGenre(int id) {
        return genreService.findById(id);

    }
    @PostMapping
    public void addGenre(@RequestBody Genre genre) {
        genreService.save(genre);
    }
    @PutMapping
    public void updateGenre(@RequestBody Genre genre) {
        genreService.update(genre);
    }
    @GetMapping("getAll")
    public List<Genre> getAllGenres() {
        return genreService.findAll();
    }
    @DeleteMapping
    public void deleteGenre(int id) {
        genreService.delete(id);
    }
}
