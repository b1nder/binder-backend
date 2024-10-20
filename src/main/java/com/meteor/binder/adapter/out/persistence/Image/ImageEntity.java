package com.meteor.binder.adapter.out.persistence.Image;

import com.meteor.binder.adapter.out.persistence.BaseEntity;
import com.meteor.binder.adapter.out.persistence.Comment.CommentEntity;
import jakarta.persistence.*;
import lombok.Getter;

import java.util.List;

@Entity(name = "image")
@Getter
public class ImageEntity extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String url;

    private Long binderId;

    @OneToMany(mappedBy = "id", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<CommentEntity> commentIds;
}
