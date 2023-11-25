package com.rath.blog.dao;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.rath.blog.entity.Blog;

public interface BlogRepository extends JpaRepositoryImplementation<Blog, Long>{
 
}
