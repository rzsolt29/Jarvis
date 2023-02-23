package com.StarkIndustries.JARVIS.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.StarkIndustries.JARVIS.models.Role;
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
            user1.setRole(Role.ADMIN);;
            user1.setEmail("tony@gmail.com");
            user1.setPassword("t1o1n1y1");
            User user2 = new User("Pepper Potts");
            user2.setEmail("pepper@gmail.com");
            user2.setPassword("p1e1p1p1e1r1");
            User user3 = new User("Happy Hogan");
            user3.setEmail("happy@gmail.com");
            user3.setPassword("h1a1p1p1y1");

            userRepository.save(user1);
            userRepository.save(user2);
            userRepository.save(user3);
        }

        logger.info("Number of users {}", userRepository.count());
    }


}
