package sani.board.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import sani.board.domain.Post;
import sani.board.repository.PostRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PostService {

    private final PostRepository postRepository;

    public void save(Post post) {
        postRepository.save(post);
    }

    public List<Post> findAll() {
        return postRepository.findAll();
    }
}
