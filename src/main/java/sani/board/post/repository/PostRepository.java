package sani.board.post.repository;

import sani.board.post.domain.Post;
import sani.board.post.dto.PostUpdateDto;

import java.util.List;
import java.util.Optional;

public interface PostRepository {
    public Post save(Post post);

    public void update(Long postId, PostUpdateDto postUpdateDto);

    public Optional<Post> findById(Long id);

    public List<Post> findAll();
}
