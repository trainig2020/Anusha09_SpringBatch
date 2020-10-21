package io.anush.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import io.anush.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}