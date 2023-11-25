package com.rath.blog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.rath.blog.dao.BlogRepository;
import com.rath.blog.entity.Blog;

public class BlogService {
 
	@Autowired
	BlogRepository repo;
	
	public List<Blog> selectAll(){
		List<Blog> blogs = repo.findAll();
		return blogs;
	}
}
