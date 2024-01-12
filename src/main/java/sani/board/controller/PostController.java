package sani.board.controller;

import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sani.board.domain.Post;
import sani.board.service.PostService;

import java.io.IOException;

@RestController
@RequestMapping("/api/post")
@RequiredArgsConstructor
public class PostController {

    private final PostService postService;

    @PostMapping
    public void savePost(@ModelAttribute Post post, HttpServletResponse response) throws IOException {
        Post savedPost = postService.save(post);
        Long postId = savedPost.getPostId();
        response.sendRedirect("/api/post/"+postId);
    }

    @GetMapping("/{postId}")
    public ResponseEntity<Post> postDetail(@PathVariable Long postId) {
        Post post = postService.findById(postId);
        return ResponseEntity.ok().body(post);
    }
}
