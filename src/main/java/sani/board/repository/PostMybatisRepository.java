package sani.board.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import sani.board.domain.Post;
import sani.board.domain.dto.PostUpdateDto;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class PostMybatisRepository implements PostRepository {
    private final PostMapper postMapper;

    @Override
    public void save(Post post) {
        postMapper.save(post);
    }

    @Override
    public void update(Long postId, PostUpdateDto postUpdateDto) {
        postMapper.update(postId,postUpdateDto);
    }

    @Override
    public Optional<Post> findById(Long id) {
        return postMapper.findById(id);
    }

    @Override
    public List<Post> findAll() {
        return postMapper.findAll();
    }
}
