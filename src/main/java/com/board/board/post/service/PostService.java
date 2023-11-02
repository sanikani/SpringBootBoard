package com.board.board.post.service;

import com.board.board.post.domain.Post;
import com.board.board.post.dto.PostRequestDto;
import com.board.board.post.dto.PostResponseDto;
import com.board.board.post.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PostService {
    private final PostRepository postRepository;

    public List<Post> findAll() {
        return postRepository.findAll();
    }

    public Post findByTitle(String title) {
        return postRepository.findByTitle(title);
    }

    public PostResponseDto save(PostRequestDto postDto) {
        Post post = new Post();
        post.createPost(postDto.getTitle(), postDto.getContents(), postDto.getPassword());
        postRepository.save(post);
        return new PostResponseDto();
    }



}
