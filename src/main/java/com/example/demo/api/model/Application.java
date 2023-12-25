package com.example.demo.api.model;
import jakarta.persistence.*;

@Entity
@Table(name = "applications")
public class Application {
    private Integer id;
    private String name;
    private String icon;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

}
