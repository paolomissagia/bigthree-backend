package com.api.bigthree.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "grand_slams")
public class GrandSlam {
    @Id
    private Integer id;
    private String name;
    private Integer number;
    private String image;
}
