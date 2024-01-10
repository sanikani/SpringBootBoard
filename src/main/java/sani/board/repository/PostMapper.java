package sani.board.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import sani.board.domain.Post;

import java.util.List;
import java.util.Optional;

@Mapper
public interface PostMapper {

    void save(Post post);

    void update();

    List<Post> findAll();

    Optional<Post> findById(Long id);
}
