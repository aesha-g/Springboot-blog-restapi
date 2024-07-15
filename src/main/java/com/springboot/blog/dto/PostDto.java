package com.springboot.blog.dto;

import jakarta.persistence.Column;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;


import java.util.Set;

@Data
public class PostDto {
    private Long id;

    //title should not be empty and have atleast 2 char
    @NotEmpty
    @Size(min = 2, message = "Post title should have atleast 2 char")
    private String title;

    // not empty and have 10 char
    @NotEmpty
    @Size(min = 10, message = "Description should have 10 chars")
    private String description;

    //not null or empty
    @NotEmpty
    private String content;
    private Set<CommentDto> comments;

    //after validation in dto enable validation in controller

}
