package com.supergroup.reddot.repository;

import com.supergroup.reddot.domain.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
