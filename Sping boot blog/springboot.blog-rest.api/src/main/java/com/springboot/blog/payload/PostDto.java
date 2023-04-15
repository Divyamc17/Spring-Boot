package com.springboot.blog.payload;

import java.util.Set;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class PostDto {

	private long id;
	
	@NotEmpty
	@Size(min=2,message="post tittle should have atleast 2 character")
	private String title;
	
	@NotEmpty
	@Size(min=10,message = "description should have atlest ten charater")
	private String description;
	
	@NotEmpty
	private String content;
	private Set<CommentDTO> comments;

}
