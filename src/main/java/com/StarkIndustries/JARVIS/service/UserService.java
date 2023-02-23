package com.StarkIndustries.JARVIS.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.StarkIndustries.JARVIS.models.User;
import com.StarkIndustries.JARVIS.models.dto.UserDTO;

@Service
public class UserService {
    
    /*private UserRepository userRepository;

    @Autowired
	public UserService(final UserRepository userRepository) {
		this.userRepository = userRepository;
	}*/
    

    public List<UserDTO> getAllUser(){
        List<User> userList = new ArrayList<User> ();
        User user1 = new User("Sanyi");
        user1.setEmail("sanyi@abc.com");
        user1.setPassword("****");
        userList.add(user1);
        User user2 = new User("Laci");
        user1.setEmail("laci@abc.com");
        user1.setPassword("*****");
        userList.add(user2);
        List<UserDTO> toReturn = new ArrayList<UserDTO> ();
        toReturn.add(convertEntityToDto(userList.get(0)));
        toReturn.add(convertEntityToDto(userList.get(1)));
        return toReturn;
    }

    public UserDTO convertEntityToDto (User user){
        UserDTO userDTO = new UserDTO();
        userDTO.setEmail(user.getEmail());
        userDTO.setName(user.getName());
        userDTO.setRegisteredAt(user.getRegisteredAt());
        userDTO.setRole(user.getRole());
        return userDTO;
    }

}
