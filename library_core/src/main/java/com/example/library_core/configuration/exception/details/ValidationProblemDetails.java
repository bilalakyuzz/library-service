package com.example.library_core.configuration.exception.details;

import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Getter
@Setter
public class ValidationProblemDetails {
    private String title;
    private Map<String, String> detail;
    private String type;

    public ValidationProblemDetails() {
        setTitle("Validation Exception");
        setType("https://turkcell.com/exceptions/validation");
    }
}
