package com.example.userservice.repository;

import com.example.userservice.entities.UserBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserBookRepository extends JpaRepository<UserBook, Integer> {
    List<UserBook> findByUserId(int userId);
}
