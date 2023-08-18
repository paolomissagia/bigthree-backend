package com.api.bigthree.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tennis_players")
public class TennisPlayer {
    @Id
    private Integer id;
    private String name;
    private Integer slams;
    private Integer masters;
    private String color;
    private String image;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSlams() {
        return slams;
    }

    public void setSlams(Integer slams) {
        this.slams = slams;
    }

    public Integer getMasters() {
        return masters;
    }

    public void setMasters(Integer masters) {
        this.masters = masters;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
