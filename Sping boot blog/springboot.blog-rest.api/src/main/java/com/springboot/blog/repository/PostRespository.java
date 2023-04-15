package com.springboot.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.blog.entity.Post;

public interface PostRespository extends JpaRepository<Post, Long> {

}
