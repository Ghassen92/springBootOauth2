package com.ouath2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ouath2.entities.User;

/**
 * User repository for CRUD operations.
 */
public interface UserRepository extends JpaRepository<User,Long> {
    User findByUsername(String username);
}
