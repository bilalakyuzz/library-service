package com.example.userservice.client;

import com.example.library_core.configuration.feign.FeignClientConfiguration;
import com.example.userservice.service.dto.response.FindBookByIdResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(name = "bookservice", configuration = FeignClientConfiguration.class)
public interface BookServiceClient {
    @GetMapping("/books/findById/{id}")
    FindBookByIdResponse findById(@PathVariable("id") int id);
}
