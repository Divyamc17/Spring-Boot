package com.springboot.blog.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.springboot.blog.entity.Comment;
import com.springboot.blog.entity.Post;
import com.springboot.blog.exception.BlogAPIException;
import com.springboot.blog.exception.ResourceNotFoundException;
import com.springboot.blog.payload.CommentDTO;
import com.springboot.blog.repository.CommentRepository;
import com.springboot.blog.repository.PostRespository;

@Service
public class CommentServiceImpl implements CommentService {

	private CommentRepository commentRepository;
	private PostRespository postRespository;
	private ModelMapper modelMapper;

	public CommentServiceImpl(CommentRepository commentRepository, PostRespository postRespository,ModelMapper modelMapper) {
		super();
		this.commentRepository = commentRepository;
		this.postRespository = postRespository;
		this.modelMapper=modelMapper;
	}

	@Override
	public CommentDTO createComment(long postId, CommentDTO commentDTO) {
		Comment comment = mapToEntity(commentDTO);
		Post post = postRespository.findById(postId)
				.orElseThrow(() -> new ResourceNotFoundException("Post", "id", postId));
		// set post to comment entity
		comment.setPost(post);

		// comment entity to DB
		Comment newComment = commentRepository.save(comment);

		return mapToDTO(newComment);
	}

	private CommentDTO mapToDTO(Comment comment) {
		CommentDTO commentDTO = modelMapper.map(comment, CommentDTO.class);
		
//		commentDTO.setId(comment.getId());
//		commentDTO.setName(comment.getName());
//		commentDTO.setEmail(comment.getEmail());
//		commentDTO.setBody(comment.getBody());
//		
		return commentDTO;

	}

	private Comment mapToEntity(CommentDTO commentDTO) {
		Comment comment = modelMapper.map(commentDTO, Comment.class);
		
//		comment.setId(commentDTO.getId());
//		comment.setName(commentDTO.getName());
//		comment.setEmail(commentDTO.getEmail());
//		comment.setBody(commentDTO.getBody());
//		
		return comment;
	}

	@Override
	public List<CommentDTO> getCommentsByPostId(long postId) {
		// retrive comments bt postId
		List<Comment> comments = commentRepository.findByPostId(postId);
		// convert list of comment entities to list of comment dto's
		return comments.stream().map(comment -> mapToDTO(comment)).collect(Collectors.toList());
	}

	@Override
	public CommentDTO getCommentById(Long postId, Long commentId) {
		Post post = postRespository.findById(postId)
				.orElseThrow(() -> new ResourceNotFoundException("Post", "id", postId));
		Comment comment = commentRepository.findById(commentId)
				.orElseThrow(() -> new ResourceNotFoundException("Comment", "id", commentId));

		if (!comment.getPost().getId().equals(post.getId())) {
			throw new BlogAPIException(HttpStatus.BAD_REQUEST, "comments not belongs to this post");
		}
		return mapToDTO(comment);
	}

	@Override
	public CommentDTO UpadateComment(Long postId, long commentId, CommentDTO commentRequest) {
		
		Post post = postRespository.findById(postId)
				.orElseThrow(() -> new ResourceNotFoundException("Post", "id", postId));

		Comment comment = commentRepository.findById(commentId)
				.orElseThrow(() -> new ResourceNotFoundException("Comment", "id", commentId));

		if (!comment.getPost().getId().equals(post.getId())) {
			throw new BlogAPIException(HttpStatus.BAD_REQUEST, "comments not belongs to this post");
		}
		comment.setName(commentRequest.getName());
		comment.setEmail(commentRequest.getEmail());
		comment.setBody(commentRequest.getBody());
		
	Comment updatedComment= commentRepository.save(comment);

		return mapToDTO(updatedComment);
	}

	@Override
	public void deleteComment(Long postId, Long commentId) {
		
		Post post = postRespository.findById(postId)
				.orElseThrow(() -> new ResourceNotFoundException("Post", "id", postId));

		Comment comment = commentRepository.findById(commentId)
				.orElseThrow(() -> new ResourceNotFoundException("Comment", "id", commentId));

		if (!comment.getPost().getId().equals(post.getId())) {
			throw new BlogAPIException(HttpStatus.BAD_REQUEST, "comments not belongs to this post");
		}
		commentRepository.delete(comment);
	}
}
