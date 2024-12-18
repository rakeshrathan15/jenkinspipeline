package com.neoteric.model;


import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "adhar",schema = "bank")
@Data
public class AdharEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "adharnumber")
    public Integer adharNumber;


    @Column(name = "name")
    public String name;

    @OneToMany(mappedBy = "myMappedByTestEntity")
    public List<AddressEntity> addressEntityList;



}
