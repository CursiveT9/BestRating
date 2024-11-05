package com.example.bestrating.dtos;

public class BaseDTO{
    private String id;

    public BaseDTO(String id) {
        this.id = id;
    }

    public BaseDTO() {
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }
}
