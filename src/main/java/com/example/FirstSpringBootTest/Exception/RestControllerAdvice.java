package com.example.FirstSpringBootTest.Exception;

import com.example.FirstSpringBootTest.Model.ResponseException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class RestControllerAdvice {


    @ExceptionHandler({ResourceNotFoundException.class})
    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    public @ResponseBody
    ResponseException handleResourceNotFound(final ResourceNotFoundException exception) {
        ResponseException r =  new ResponseException( ) ;
        r.setCode(404);
        r.setMessage(exception.getMessage());
        return r;
    }




}
