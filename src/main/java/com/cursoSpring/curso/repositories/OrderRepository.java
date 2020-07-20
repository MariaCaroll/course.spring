package com.cursoSpring.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursoSpring.curso.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long> {

}
