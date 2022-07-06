package com.codeup.groovyspringblog.repositories;

import com.codeup.groovyspringblog.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {

}