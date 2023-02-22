package com.StarkIndustries.JARVIS.repositories;

import org.springframework.data.repository.CrudRepository;

import com.StarkIndustries.JARVIS.models.User;

public interface UserRepository extends CrudRepository<User, Long>  {
    
}
