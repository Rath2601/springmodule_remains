package com.rath.blog.dao;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.rath.blog.entity.Blog;
import com.rath.blog.entity.User;

@SpringBootTest
public class BlogRepositoryTest {

	@Autowired
	BlogRepository repo;

	@Test
	public void saveMethod() {
		LocalDateTime now = LocalDateTime.now();
		User user = new User();
		Blog blog = new Blog(1001l, "Blog_1", "Story about rath", now, user);
		Blog b = repo.save(blog);
		System.out.println(b.getBlogId());
		
	}
}
