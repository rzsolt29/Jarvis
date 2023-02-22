package com.StarkIndustries.JARVIS.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.StarkIndustries.JARVIS.models.User;
import com.StarkIndustries.JARVIS.repositories.UserRepository;

@Component
public class UserDataLoader implements CommandLineRunner {
    private final Logger logger = LoggerFactory.getLogger(UserDataLoader.class);

    @Autowired
    UserRepository userRepository;
    
    @Override
    public void run(String... args) throws Exception {
        loadSeedData();
    }

    private void loadSeedData(){
        if(userRepository.count() == 0){
            User user1 = new User("Tony Stark");
            user1.setAdmin(true);
            User user2 = new User("Pepper Potts");
            User user3 = new User("Happy Hogan");

            userRepository.save(user1);
            userRepository.save(user2);
            userRepository.save(user3);
        }

        logger.info("Number of users {}", userRepository.count());
    }


}
