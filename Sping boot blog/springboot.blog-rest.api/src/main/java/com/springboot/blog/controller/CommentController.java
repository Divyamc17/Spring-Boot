package com.springboot.blog.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.blog.payload.CommentDTO;
import com.springboot.blog.service.CommentService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/")
public class CommentController {

	private CommentService commentService;

	public CommentController(CommentService commentService) {
		super();
		this.commentService = commentService;
	}

	@PostMapping("/posts/{postId}/comment")
	public ResponseEntity<CommentDTO> createComment(@PathVariable long postId,
		@Valid	@RequestBody CommentDTO commentDto) {
		return new ResponseEntity<>(commentService.createComment(postId, commentDto), HttpStatus.CREATED);
	}

	@GetMapping("/posts/{postId}/comment")
	List<CommentDTO> getCommentByPostId(@PathVariable Long postId) {
		return commentService.getCommentsByPostId(postId);

	}

	@GetMapping("/posts/{postId}/comment/{id}")
	public ResponseEntity<CommentDTO> getCommentById(@PathVariable(value = "postId") Long postId,
			@PathVariable(value = "id") Long commentId) {
		CommentDTO commentDTO = commentService.getCommentById(postId, commentId);
		return new ResponseEntity<>(commentDTO, HttpStatus.OK);
	}

	@PutMapping("/posts/{postId}/comment/{id}")
	public ResponseEntity<CommentDTO> updateComment(@PathVariable(value = "postId") Long postId,
			@PathVariable(value = "id") Long commentId, @Valid @RequestBody CommentDTO CommentDTO) {
		return new ResponseEntity<>(commentService.UpadateComment(postId, commentId, CommentDTO), HttpStatus.OK);
	}

	@DeleteMapping("/posts/{postId}/comment/{id}")
	public ResponseEntity<String> deleteComment(@PathVariable(value = "postId") Long postId,
			@PathVariable(value = "id") Long commentId) {
		commentService.deleteComment(postId, commentId);
		return new ResponseEntity<>("comment deleted sucessfully", HttpStatus.OK);
	}
}
