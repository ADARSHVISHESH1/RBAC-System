package com.rbac.backend.repository;

import com.rbac.backend.model.user;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<user, Long> {
    Optional<user> findByUsername(String username);
}
