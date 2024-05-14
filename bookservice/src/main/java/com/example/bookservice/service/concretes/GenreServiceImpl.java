package com.example.bookservice.service.concretes;

import com.example.bookservice.entities.Genre;
import com.example.bookservice.repository.GenreRepository;
import com.example.bookservice.service.abstracts.GenreService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class GenreServiceImpl implements GenreService {
    private final GenreRepository genreRepository;
    @Override
    public void save(Genre genre) {
        genreRepository.save(genre);
    }

    @Override
    public Genre findById(int id) {
        return genreRepository.findById(id).orElse(null);
    }

    @Override
    public List<Genre> findAll() {
        return genreRepository.findAll();
    }

    @Override
    public void delete(int id) {
        genreRepository.deleteById(id);
    }

    @Override
    public void update(Genre genre) {
        genreRepository.save(genre);

    }
}
