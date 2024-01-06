package com.full_app.models;


import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name="countries")
@Data
//@NoArgsConstructor
//@AllArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "country_id")
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer country_id;

    private String country_name;
    private String code;
    private String country_capital;
    private String description;
    private String nationality;
    private String continent;

    @OneToMany(mappedBy = "country")
    private List<State> states;
}
