package com.springboot.blog.service;

import java.util.List;

import com.springboot.blog.payload.CommentDTO;

public interface CommentService {
	CommentDTO createComment(long postId,CommentDTO commentDTO);
	List<CommentDTO> getCommentsByPostId(long postId); 
	CommentDTO getCommentById(Long postId,Long commentId);
	CommentDTO UpadateComment(Long postId,long commentId,CommentDTO commentRequest);
	void deleteComment(Long postId,Long commentId);

}
