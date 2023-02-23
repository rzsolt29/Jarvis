package com.StarkIndustries.JARVIS.models.dto;

import lombok.Data;

import java.time.Instant;

import com.StarkIndustries.JARVIS.models.Role;

@Data
public class UserDTO {
    private long id;
    private String email;
    private String name;
    private Role role;
    private Instant registeredAt;

    
}
