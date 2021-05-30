package com.hrav.model;


import lombok.Data;

import javax.persistence.*;


@Entity
@Data
public class Province {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true,nullable = false)
    private String name;

}
