package com.codeup.groovyspringblog.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public class PostController {
    @GetMapping("/posts")
    @ResponseBody
    public String showPosts(@PathVariable String x){
        return "index";
    }

    @GetMapping("/posts/{id}")
    @ResponseBody
    public String showIdPosts(@PathVariable String x, Integer id){
        return "posts/id";
    }

    @GetMapping("/posts")
    @ResponseBody
    public String showCreatePost(@PathVariable String x){
        return "posts/create";
    }

    @PostMapping("/posts/create")
    @ResponseBody
    public String createPost(@PathVariable String x){
        return "posts/create";
    }


}
