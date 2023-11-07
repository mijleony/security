package com.demo.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.security.pojos.entity.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity,Long> {

  // @Query("select us from users as us where us.code := userCode ")
  // User findByCode(@Param("userCode") String userCode);

    // User findByCode(String code);
}
