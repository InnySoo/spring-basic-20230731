package com.sooin.basic.repository;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepository extends JpaRepository<UserEntity, String> {
  
}
