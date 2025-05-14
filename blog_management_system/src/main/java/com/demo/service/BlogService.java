package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entity.Blog;
import com.demo.repository.BlogRepository;

@Service
public class BlogService {

	@Autowired
	BlogRepository brsp;
	
	public String save(Blog b) {
		brsp.save(b);
		return "Sucessfully save blog data";
		
	}
	
	public List findall() {
		return brsp.findAll();
	}
	
	public Blog findbyid(int id) {
		return brsp.findById(id) .orElse(null);
	}
	
	public String deletebyid(int id) {
		brsp.deleteById(id);
		return "Record delete sucessfully";
			
	}
	
	public String updateBlog(int id, Blog newBlog) {
	    Blog existingBlog = brsp.findById(id).orElse(null);

	    if (existingBlog == null) {
	        return "Blog post not found";
	    }

	    if (newBlog.getTitle() == null && newBlog.getContent() == null &&
	        newBlog.getCategory() == null && newBlog.getAuthor() == null &&
	        newBlog.getImg() == null) {
	        return "New blog data is empty";
	    }

	    if (newBlog.getTitle() != null) {
	        existingBlog.setTitle(newBlog.getTitle());
	    }

	    if (newBlog.getContent() != null) {
	        existingBlog.setContent(newBlog.getContent());
	    }

	    if (newBlog.getCategory() != null) {
	        existingBlog.setCategory(newBlog.getCategory());
	    }

	    if (newBlog.getAuthor() != null) {
	        existingBlog.setAuthor(newBlog.getAuthor());
	    }

	    if (newBlog.getImg() != null) {
	        existingBlog.setImg(newBlog.getImg());
	    }

	    brsp.save(existingBlog);
	    return "Blog updated successfully";
	}

	
	
}
