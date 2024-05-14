package com.example.bookservice.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Table(name = "genres")
@Entity
@Getter
@Setter
public class Genre {
    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @OneToMany(mappedBy = "genre")
    @JsonIgnore
    private List<Book> books;



}
