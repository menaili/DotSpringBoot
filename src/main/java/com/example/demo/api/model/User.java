package com.example.demo.api.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name="users")
public class User {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)

    private Integer id;
    private String name;
    private int age;
    private String email;
    private String password; 

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Phone> phones;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Link> links;

    
}