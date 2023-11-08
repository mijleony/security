package com.demo.security.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.security.pojos.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity,Long> {

  Optional<UserEntity> findByCode(String code);

}
