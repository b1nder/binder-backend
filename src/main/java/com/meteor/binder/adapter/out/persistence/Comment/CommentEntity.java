package com.meteor.binder.adapter.out.persistence.Comment;

import com.meteor.binder.adapter.out.persistence.BaseEntity;
import com.meteor.binder.domain.enums.CommentType;
import jakarta.persistence.*;
import lombok.Getter;

@Entity(name = "comment")
@Getter
public class CommentEntity extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String message;

    private Long authorId;

    @Enumerated(EnumType.STRING)
    private CommentType commentType;

    private Long imageId;
}
