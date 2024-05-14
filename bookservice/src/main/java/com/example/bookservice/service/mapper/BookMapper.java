package com.example.bookservice.service.mapper;

import com.example.bookservice.entities.Book;
import com.example.bookservice.service.dto.response.FindBookByIdResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BookMapper {
    BookMapper INSTANCE= Mappers.getMapper(BookMapper.class);
    @Mapping(target = "genre",source = "genre.name")
    FindBookByIdResponse getBookResponseFromBook(Book book);


}
