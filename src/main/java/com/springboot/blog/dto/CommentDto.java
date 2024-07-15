package com.springboot.blog.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class CommentDto {
    private long id;
    @NotEmpty(message = "name should not be empty or null")
    private String name;

    @NotEmpty(message = "Email should not be empty or null")
    @Email
    private String email;

    @NotEmpty
    @Size(min = 10, message = "Body should not be empty and must have atleast 10 chars")
    private String body;
}
