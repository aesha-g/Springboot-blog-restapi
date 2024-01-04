package com.springboot.blog.service;

import com.springboot.blog.dto.CommentDto;

import java.util.List;

public interface CommentService {
    CommentDto createComment(long postId, CommentDto commentDto);

    List<CommentDto> getCommentsByPostId(long postId);

    CommentDto getCommentById(Long postId,Long commentId);

    //update commment by id

    CommentDto updateComment(Long postId, long commentId, CommentDto commentDto);

    void deleteComment(Long postId, Long commentId);
}
