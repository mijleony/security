package com.demo.security.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.security.pojos.dto.User;
import com.demo.security.repository.UserRepository;
import com.demo.security.service.UserService;

@Service
public class UserServiceImpl implements UserService {

  @Autowired
  UserRepository userRepository;

  @Override
  public User getUserDetail(String userCode) {

    // com.demo.security.pojos.entity.User ue = userRepository.findByCode(userCode);

    // return User.builder()
    // .code(ue.getCode())
    // .name(ue.getName())
    // .lastName(ue.getLastName())
    // .documentType(ue.getDocumentType())
    // .documentNumber(ue.getDocumentNumber())
    // .email(ue.getEmail())
    // .build();

     return User.builder()
    .code("2314434")
    .name("roberto")
    .lastName("velasquez")
    .documentType("CE")
    .documentNumber("2E222098R4")
    .email("robertv@gmail.com")
    .build();

    // throw new UnsupportedOperationException("Unimplemented method 'getUserDetail'");
  }
  
}
