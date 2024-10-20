package com.meteor.binder.adapter.out.persistence.BInder;

import com.meteor.binder.adapter.out.persistence.BaseEntity;
import com.meteor.binder.adapter.out.persistence.Image.ImageEntity;
import com.meteor.binder.domain.enums.BinderCategory;
import com.meteor.binder.domain.enums.BinderType;
import com.meteor.binder.domain.enums.ShareType;
import jakarta.persistence.*;
import lombok.Getter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "binder")
@Getter
public class BinderEntity extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private BinderType binderType;

    private String title;

    private LocalDate startDate;
    private LocalDate endDate;

    @Enumerated(EnumType.STRING)
    private ShareType shareType;

    @Enumerated(EnumType.STRING)
    private BinderCategory binderCategory;

    private String ticketImage;

    @OneToMany(mappedBy = "id", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ImageEntity> images;

    private String location;
}
