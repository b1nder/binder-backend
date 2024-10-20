package com.meteor.binder.adapter.out.persistence.Comment;

import com.meteor.binder.adapter.out.persistence.Image.ImageEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<CommentEntity, Long> {
}
