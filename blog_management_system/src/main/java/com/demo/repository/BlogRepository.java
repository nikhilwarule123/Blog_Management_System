package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.entity.Blog;

@Repository
public interface BlogRepository extends JpaRepository<Blog,Integer>{
	

}
