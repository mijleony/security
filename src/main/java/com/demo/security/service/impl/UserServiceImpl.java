package com.demo.security.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.security.pojos.dto.User;
import com.demo.security.pojos.entity.UserEntity;
import com.demo.security.repository.UserRepository;
import com.demo.security.service.UserService;

@Service
public class UserServiceImpl implements UserService {

  public final UserRepository userRepository;

  UserServiceImpl(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  @Override
  public User getUserDetail(String userCode) throws Exception {

    UserEntity ue = this.userRepository.findAll()
    .stream()
      .filter( userEnt -> 
        userCode.equals(userEnt.getCode())
      )
      .findFirst().orElseThrow(
        Exception::new 
      );

    return User.builder()
    .code(ue.getCode())
    .name(ue.getName())
    .lastName(ue.getLastName())
    .documentType(ue.getDocumentType())
    .documentNumber(ue.getDocumentNumber())
    .email(ue.getEmail())
    .build();
  }
}
