package com.sparta.spartabulletinboardbackend.post.dto;

import com.sparta.spartabulletinboardbackend.post.entity.Post;
import lombok.Builder;
import lombok.Getter;

@Getter
public class PostReadAllData {
    private final Long postId;
    private final String title;
    private final boolean success;
    private final String createdAt;

    @Builder
    public PostReadAllData(Post post) {
        this.postId = post.getId();
        this.title = post.getTitle();
        this.success = post.isSuccess();
        this.createdAt = post.getCreatedAt().toString();
    }
}