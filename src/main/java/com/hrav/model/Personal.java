package com.hrav.model;


import lombok.Data;

import lombok.experimental.Accessors;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "personals")
@Data
@Accessors(chain = true)
public class Personal {
    @Id
    @GeneratedValue
    private Long id;

    @Column(unique = true,name = "personal_code")
    private String personalcode;

    @Column(unique = true,length = 11)
    private String mobile;

    @ManyToMany
    @JoinTable(
            name = "doctor_role",
            joinColumns = {@JoinColumn(name = "user_id")},
            inverseJoinColumns = {@JoinColumn(name = "role_id")})
    private Set<Role> roles = new HashSet<>();
}
