package com.springboot.blog.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.blog.payload.PostDto;
import com.springboot.blog.payload.PostResponse;
import com.springboot.blog.service.PostService;
import com.springboot.utils.AppConstants;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/posts")
public class PostController {

	private PostService postService;

	public PostController(PostService postService) {
		super();
		this.postService = postService;
	}
    @PreAuthorize("hasRole('ADMIN')")
	@PostMapping
	public ResponseEntity<PostDto> createPost(@Valid @RequestBody PostDto postDto) {
		return new ResponseEntity<>(postService.createPost(postDto), HttpStatus.CREATED);
	}

	/*@GetMapping()
	public List<PostDto> getAllPosts() {
		return postService.getAllPosts();

	}*/

	@GetMapping("/{id}")
	public ResponseEntity<PostDto> getPostById(@PathVariable(name = "id") long id) {
		return new ResponseEntity<>(postService.getPostById(id), HttpStatus.OK);
	}
	
	@PreAuthorize("hasRole('ADMIN')")
	@PutMapping("/{id}")
	public ResponseEntity<PostDto> updateById(@Valid @RequestBody PostDto dto, @PathVariable(name = "id") long id) {
		return new ResponseEntity<>(postService.updateById(dto, id), HttpStatus.OK);
	}
	
	@PreAuthorize("hasRole('ADMIN')")
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteById(@PathVariable(name = "id") long id) {
		postService.deleteById(id);
		return new ResponseEntity<>("Delete the post by id sucessfully...", HttpStatus.OK);
	}

	@GetMapping()
	public PostResponse getAllPosts(
	@RequestParam(value="pageNo",defaultValue = AppConstants.DEFAULT_PAGE_NUMBER,required = false) int pageNo,
    @RequestParam(value="pageSize",defaultValue = AppConstants.DEFAULT_PAGE_SIZE,required = false) int pageSize,
    @RequestParam(value="sortBy",defaultValue = AppConstants.DEFAULT_SORT_BY,required = false) String sortBy,
    @RequestParam(value="sortDir",defaultValue = AppConstants.DEFAULT_SORT_DIRECTION,required = false) String sortDir
    )
	{
		return postService.getAllPosts(pageNo, pageSize,sortBy,sortDir);
		
	}
}