package com.sparta.spartabulletinboardbackend.comment.repository;

import com.sparta.spartabulletinboardbackend.comment.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    @Query("select c from Comment c join fetch c.user where c.id = :comment_id")
    Optional<Comment> findByIdWithUser(@Param("comment_id") Long commentId);
}
