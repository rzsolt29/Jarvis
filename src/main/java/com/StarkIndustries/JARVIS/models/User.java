package com.StarkIndustries.JARVIS.models;

import java.time.Instant;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "USERTABLE")
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    @Setter
    private Long id;
    
    @Column(unique = true)
    @Getter
    @Setter
    private String email;

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private String password;

    @Getter
    @Setter
    private Role role;

    @Getter
    @Setter
    private Instant registeredAt;

    public User() {}

    public User(String name) {
        this.name = name;
        this.role = Role.USER;
        this.registeredAt =Instant.now();
    }

    @Override
    public String toString() {
        return String.format("User{id=%d, email='%s', name='%s', password='%s', role='%s', registeredAt='%s'}",
         id, email, name, password, role, registeredAt);
    }

}
