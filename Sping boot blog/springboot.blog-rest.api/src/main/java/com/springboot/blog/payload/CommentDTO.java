package com.springboot.blog.payload;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class CommentDTO {
	private long id;
	
	@NotEmpty
	@Size(min=2,message = "Name Should Not be Null")
	private String name;
	
	@NotEmpty(message = "Email Should Not be Null")
	@Email
	private String email;
	

	@NotEmpty
	@Size(min=10,message = "Name Should Not be Null and privoid min 10 chrt")
	private String body;

}
