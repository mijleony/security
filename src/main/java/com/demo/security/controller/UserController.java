package com.demo.security.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.security.pojos.dto.User;
import com.demo.security.service.UserService;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@AllArgsConstructor
@RequestMapping("/users")
public class UserController {

  private UserService userService;

  @GetMapping(
    path = "/user/{userCode}", 
    produces = MediaType.APPLICATION_JSON_VALUE
  )
  public User getInfo(@PathVariable("userCode") String userCode) {
    try {
      return userService.getUserDetail(userCode);
    } catch (Exception e) {
      log.info("no se encontró usuario con code -> {}", userCode);
    }
    return null;
  }

  //  @PostMapping(
  //   path = "/user",
  //   consumer = MediaType.APPLICATION_JSON_VALUE,
  //   produces = MediaType.APPLICATION_JSON_VALUE
  // )
  // public User postUser(@PathVariable("userCode") String userCode) {
  //   try {
  //     return userService.getUserDetail(userCode);
  //   } catch (Exception e) {
  //     log.info("no se encontró usuario con code -> {}", userCode);
  //   }
  //   return null;
  // }
}