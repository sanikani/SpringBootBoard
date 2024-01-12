package sani.board.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import sani.board.domain.Post;
import sani.board.domain.dto.request.PostUpdateDto;

import java.util.List;
import java.util.Optional;

@Mapper
public interface PostMapper {

    Post save(Post post);

    void update(@Param("id") Long id, @Param("updatePost") PostUpdateDto postUpdateDto);

    List<Post> findAll();

    Optional<Post> findById(Long id);
}
