package com.example.validatemusicinfomation.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
public class Music {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @NotEmpty
    @Size(min = 3, max = 800)
    @Pattern(regexp = "^[A-Z a-z ]*$")
    String name;

    @NotEmpty
    @Size(min = 3, max = 300)
    @Pattern(regexp = "^[A-Z a-z ]*$")
    String singer;

    @NotEmpty
    @Size(min = 3, max = 1000)
    @Pattern(regexp = "^[A-Z a-z, ]*$")
    String category;


    public Music() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}