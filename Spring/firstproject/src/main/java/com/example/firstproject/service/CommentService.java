package com.example.firstproject.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.firstproject.dto.CommentDto;
import com.example.firstproject.entity.Comment;
import com.example.firstproject.repository.ArticleRepository;
import com.example.firstproject.repository.CommentRepository;

public class CommentService {

	@Autowired
	private CommentRepository commentRepository;
	

	@Autowired
	private ArticleRepository articleRepository;


	public List<CommentDto> comments(Long articleId) {

		List<Comment> comments = commentRepository.findByArticleId(articleId);
		
		List<CommentDto> dtos = new ArrayList<CommentDto>();
		
		for(int i=0; i< comments.size(); i++)
		{
			Comment c = comments.get(i);
			CommentDto dto = CommentDto.createCommentDto(c);
			dtos.add(dto);
		}
		return dtos;
	}
}