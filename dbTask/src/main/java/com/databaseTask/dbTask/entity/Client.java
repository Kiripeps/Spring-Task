package com.databaseTask.dbTask.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Contact> contacts;

    //getters
    public Long getId() {return id;}

    public String getName() {return name;}

    //setters
    public void setName(String name) {this.name = name;}

    public void setId(Long id) {this.id = id;}
}


