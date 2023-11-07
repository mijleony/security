package com.demo.security.controller;

import com.demo.security.pojos.dto.User;
import com.demo.security.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

  @Autowired
  private UserService userService;

  @GetMapping(
    path = "/user/{userCode}", 
    produces = MediaType.APPLICATION_JSON_VALUE
  )
  public User getInfo(@PathVariable("userCode") String userCode) {
    return userService.getUserDetail(userCode);
  }
}