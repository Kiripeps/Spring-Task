package com.databaseTask.dbTask.entity;


import jakarta.persistence.*;

@Entity
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String type; // "phone" or "email"
    private String value; // information

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    // Getters
    public String getValue() {return value;}

    public Long getId() {return id;}

    public String getType() {return type;}

    public Client getClient() {return client;}

    //Setters
    public void setValue(String value) {this.value = value;}

    public void setType(String type) {this.type = type;}

    public void setClient(Client client) {this.client = client;}
}
