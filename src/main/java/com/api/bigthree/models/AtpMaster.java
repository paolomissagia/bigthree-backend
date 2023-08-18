package com.api.bigthree.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "atp_masters")
public class AtpMaster {
    @Id
    private Integer id;
    private String name;
    private Integer number;
    private String image;
}
