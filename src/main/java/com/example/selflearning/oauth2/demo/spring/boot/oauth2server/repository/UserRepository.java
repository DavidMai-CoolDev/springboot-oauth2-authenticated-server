package com.example.selflearning.oauth2.demo.spring.boot.oauth2server.repository;

import com.example.selflearning.oauth2.demo.spring.boot.oauth2server.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface UserRepository extends JpaRepository<User, Long> {

	User findByUsername(String username);

}


