package com.abhi.quizexam.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abhi.quizexam.pojo.UserLogin;

public interface UserRepo extends JpaRepository<UserLogin, Integer>{

}
