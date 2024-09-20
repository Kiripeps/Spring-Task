package com.databaseTask.dbTask.dto;

public class ContactDTO {
    private Long id;
    private String type;
    private String value;

    // Геттеры и сеттеры
    public Long getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getValue() {
        return value;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
