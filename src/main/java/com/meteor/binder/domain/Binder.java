package com.meteor.binder.domain;

import com.meteor.binder.domain.enums.BinderCategory;
import com.meteor.binder.domain.enums.BinderType;
import com.meteor.binder.domain.enums.ShareType;
import lombok.Getter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Getter
public class Binder {

    private BinderType binderType;

    private String title;
    private LocalDate startDate;
    private LocalDate endDate;

    private ShareType shareType;

    private BinderCategory binderCategory;

    private String ticketImage;

    private List<String> images;

    private String location;
}
