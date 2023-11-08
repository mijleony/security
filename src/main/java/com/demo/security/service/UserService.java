package com.demo.security.service;

import com.demo.security.pojos.dto.User;

public interface UserService {
  User getUserDetail(String userCode) throws Exception;
  User postUser(User user) throws Exception ;
}
