package com.educandoweb.springbootproject.Services.Exceptions;

public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException (Object id){
        super("Resource not found. id " + id);
    }
}
