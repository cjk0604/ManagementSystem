package com.example.fastcamp.controller.repository;

import com.example.fastcamp.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

//    // select * from user where account = ? << test03, test04
//    Optional<User> findByAccount(String account);
//
//    Optional<User> findByEmail(String email);
//
//    // select * from user where account = ? & email = ?
//    Optional<User> findByAccountAndEmail(String account, String email);
}
