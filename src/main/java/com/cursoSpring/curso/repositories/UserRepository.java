package com.cursoSpring.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursoSpring.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
