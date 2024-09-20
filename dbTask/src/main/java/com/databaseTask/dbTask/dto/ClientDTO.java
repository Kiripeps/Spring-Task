package com.databaseTask.dbTask.dto;

public class ClientDTO {
    private Long id;
    private String name;

    // Геттеры и сеттеры
    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
