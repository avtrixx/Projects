package com.example.FirstSpringBootTest.Exception;

public class ServiceException extends Exception{
    public ServiceException(){
        super();
    }

    public ServiceException(final String message){
        super(message);

    }
}
