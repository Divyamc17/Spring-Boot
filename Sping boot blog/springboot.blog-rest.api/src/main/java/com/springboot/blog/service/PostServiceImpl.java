package com.springboot.blog.service;

import java.util.List;
import java.util.stream.Collectors;

import org.apache.catalina.mapper.Mapper;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.springboot.blog.entity.Post;
import com.springboot.blog.exception.ResourceNotFoundException;
import com.springboot.blog.payload.PostDto;
import com.springboot.blog.payload.PostResponse;
import com.springboot.blog.repository.PostRespository;

@Service
public class PostServiceImpl implements PostService {

	private PostRespository postRespository;
	
	private ModelMapper modelMapper;

	public PostServiceImpl(PostRespository postRespository,ModelMapper modelMapper) {
		super();
		this.postRespository = postRespository;
		this.modelMapper=modelMapper;
	}

	@Override
	public PostDto createPost(PostDto postDto) {

		// convert DTO to Entity
		Post post = mapToEntity(postDto);

		Post newPost = postRespository.save(post);

		// convert entity to DTO
		PostDto postResponse = mapToDTO(newPost);

		return postResponse;
	}

	// convert entity into DTO
	private PostDto mapToDTO(Post post) {
		PostDto postDto=modelMapper.map(post, PostDto.class);
						
		/*
		 * PostDto postDto = new PostDto(); postDto.setId(post.getId());
		 * postDto.setTitle(post.getTitle());
		 * postDto.setDescription(post.getDescription());
		 * postDto.setContent(post.getContent()); return postDto;
		 */
		return postDto;
	}

	// convert DTO into entity
	private Post mapToEntity(PostDto postDto) {
		Post post=modelMapper.map(postDto, Post.class);
		
		/*
		 * Post post = new Post(); post.setTitle(postDto.getTitle());
		 * post.setDescription(postDto.getDescription());
		 * post.setContent(postDto.getContent());
		 */
		return (post);

	}

	@Override
	public List<PostDto> getAllPosts() {
		List<Post> posts = postRespository.findAll();
		return posts.stream().map(post -> mapToDTO(post)).collect(Collectors.toList());

	}

	@Override
	public PostDto getPostById(long id) {
		Post post = postRespository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Post", "id", id));
		return mapToDTO(post);
	}

	@Override
	public PostDto updateById(PostDto postDto, long id) {
		Post post = postRespository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Post", "id", id));
		post.setTitle(postDto.getTitle());
		post.setDescription(postDto.getDescription());
		post.setContent(postDto.getDescription());
		Post updatedPost = postRespository.save(post);

		return mapToDTO(updatedPost);
	}

	@Override
	public PostDto deleteById(long id) {
		Post post = postRespository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Post", "id", id));
		postRespository.delete(post);
		return null;
	}

	@Override
	public PostResponse getAllPosts(int pageNo, int pageSize,String sortBy,String sortDir) {
		
		Sort sort=sortDir.equalsIgnoreCase(Sort.Direction.ASC.name())?Sort.by(sortBy).ascending()
				:Sort.by(sortBy).descending();
		Pageable page = PageRequest.of(pageNo, pageSize, sort);
		Page<Post> posts = postRespository.findAll(page);
		List<Post> listOfPosts = posts.getContent();
		List<PostDto> content = listOfPosts.stream().map(post -> mapToDTO(post)).collect(Collectors.toList());

		PostResponse postResponse = new PostResponse();
		postResponse.setContent(content);
		postResponse.setPageNo(posts.getNumber());
		postResponse.setPageSize(posts.getSize());
		postResponse.setTotalElement(posts.getTotalElements());
		postResponse.setTotalPages(posts.getTotalPages());
		postResponse.setLast(posts.isLast());

		return postResponse;

	}

}
