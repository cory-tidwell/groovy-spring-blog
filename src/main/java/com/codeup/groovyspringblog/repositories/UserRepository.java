package com.codeup.groovyspringblog.repositories;

import com.codeup.groovyspringblog.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}