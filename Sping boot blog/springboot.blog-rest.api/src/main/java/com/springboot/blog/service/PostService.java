package com.springboot.blog.service;

import java.util.List;

import com.springboot.blog.payload.PostDto;
import com.springboot.blog.payload.PostResponse;

public interface PostService {
	public PostDto createPost(PostDto postDto);
	public List<PostDto> getAllPosts();
	PostDto getPostById(long id);
	PostDto updateById(PostDto postDto,long id);
	PostDto deleteById(long id);
	public PostResponse getAllPosts(int pageNo,int pageSize,String sortBy,String sortDir);

}
