package com.example.springboot.learning.jpa.jpain10steps.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springboot.learning.jpa.jpain10steps.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}