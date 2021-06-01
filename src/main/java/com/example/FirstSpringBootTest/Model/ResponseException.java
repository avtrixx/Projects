package com.example.FirstSpringBootTest.Model;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class ResponseException {

    private   String message;
    private   int code;
}
