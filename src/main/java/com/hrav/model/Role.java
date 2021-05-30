package com.hrav.model;

import lombok.Data;

import javax.persistence.*;

/**
 * @author Morteza Vesal
 */

@Entity
@Table(name = "role")
@Data
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "name", length = 50,unique = true,nullable = false)
    private RoleName name;

}
