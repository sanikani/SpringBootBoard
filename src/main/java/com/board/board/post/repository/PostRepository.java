package com.board.board.post.repository;

import com.board.board.post.domain.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post,Long> {
    Post findByTitle(String title);
}
