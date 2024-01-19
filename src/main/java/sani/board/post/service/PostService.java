package sani.board.post.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import sani.board.post.domain.Post;
import sani.board.post.repository.PostRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PostService {

    private final PostRepository postRepository;

    public Post save(Post post) {
        postRepository.save(post);
        return post;
    }

    public List<Post> findAll() {
        return postRepository.findAll();
    }

    public Post findById(Long postId) {
        Optional<Post> post = postRepository.findById(postId);
        return post.get();
    }
}
