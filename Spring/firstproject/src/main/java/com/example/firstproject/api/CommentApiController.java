package com.example.firstproject.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.firstproject.dto.CommentDto;
import com.example.firstproject.service.CommentService;

public class CommentApiController {

	@Autowired
	private CommentService commentService;
	
	
	public ResponseEntity<List<CommentDto>>comments(@PathVariable Long articleId)
	{
		List<CommentDto> dtos = commentService.comments(articleId);
				
		return ResponseEntity.status(HttpStatus.OK).body(dtos);
	}
}