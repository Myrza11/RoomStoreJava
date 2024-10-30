package com.example.javasecuritydemo.models;


import jakarta.persistence.*;

@Entity
@Table
public class Room {
    @Id
    @SequenceGenerator(
            name = "books",
            sequenceName = "books",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "books"
    )
    private Long id;
    private String name;
    public Room() {

    }
    public Room(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Room(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


}
