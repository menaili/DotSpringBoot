package com.example.demo.api.model;
import jakarta.persistence.*;

@Entity
@Table(name = "categories")
public class Category {
    private Integer id;
    private String name;
    private String icon;

    @OneToOne(mappedBy = "category")
    private Application application;

    /*Getters */
    public Integer getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getIcon() {
        return icon;
    }

    /*Setters */
    public void setId(Integer id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setIcon(String icon) {
        this.icon = icon;
    }

    
    
}
