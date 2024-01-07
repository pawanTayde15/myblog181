package com.myblog.myblog181.repository;

import com.myblog.myblog181.controller.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
