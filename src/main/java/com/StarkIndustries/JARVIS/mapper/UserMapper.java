package com.StarkIndustries.JARVIS.mapper;

import com.StarkIndustries.JARVIS.models.User;
import com.StarkIndustries.JARVIS.models.dto.UserDTO;

public class UserMapper {
    public static UserDTO map (final User user){
        UserDTO userDTO = new UserDTO();
        userDTO.setId(user.getId());
        userDTO.setEmail(user.getEmail());
        userDTO.setName(user.getName());
        userDTO.setRegisteredAt(user.getRegisteredAt());
        userDTO.setRole(user.getRole());
        return userDTO;
    }

    public static User map(final UserDTO userDto) {
		return null;
	}
}
