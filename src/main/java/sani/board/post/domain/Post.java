package sani.board.post.domain;

import lombok.Data;

import java.util.Date;

@Data
public class Post {
    private Long postId;
    private Long userId;
    private String title;
    private String content;
    private Date createDate;
    private Date updateDate;
}
