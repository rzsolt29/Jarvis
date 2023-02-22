package com.StarkIndustries.JARVIS.models;

import java.time.Instant;

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

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private boolean isAdmin;

    @Getter
    @Setter
    private Instant registeredAt;

    public User() {}

    public User(String name) {
        this.name = name;
        this.isAdmin = false;
        this.registeredAt =Instant.now();
    }

    @Override
    public String toString() {
        return String.format("User{id=%d, name='%s', isAdmin='%s', registeredAt='%s'}",
         id, name, isAdmin, registeredAt);
    }

}
