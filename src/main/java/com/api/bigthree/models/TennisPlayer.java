package com.api.bigthree.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
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
}
