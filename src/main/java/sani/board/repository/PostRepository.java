package sani.board.repository;

import sani.board.domain.Post;
import sani.board.domain.dto.request.PostUpdateDto;

import java.util.List;
import java.util.Optional;

public interface PostRepository {
    public Post save(Post post);

    public void update(Long postId, PostUpdateDto postUpdateDto);

    public Optional<Post> findById(Long id);

    public List<Post> findAll();
}
