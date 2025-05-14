package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.Blog;
import com.demo.service.BlogService;

@RestController
@RequestMapping("/blogs")
@CrossOrigin(origins="http://localhost:3000")

public class BlogController {
	@Autowired
	BlogService bcm;
	
	@PostMapping("/blogsave")//http://localhost:8080/blogs/blogsave
	public String save(@RequestBody Blog u) {
		return bcm.save(u);
		
	}
	
	@GetMapping("/blogfindall")//http://localhost:8080/blogs/blogfindall
	public List findall() {
		return bcm.findall();
	}
	
	@GetMapping("/empdata/{id}")//http://localhost:8080/blogs/empdata/2
	public Blog findbyid(@PathVariable int id) {
		return bcm.findbyid(id);
	}
	
	@DeleteMapping("/delete/{id}")//http://localhost:8080/blogs/delete/2
	public String deletebyid(@PathVariable int id) {
		return bcm.deletebyid(id);
	}
	
	@PutMapping("/update/{id}")//http://localhost:8080/blogs/update/3
	public String update(@PathVariable int id,@RequestBody Blog newBlog) {
		return bcm.updateBlog(id, newBlog);
	}
	

}

//{
//	 
//    "title":"springboot",
//	  "content":"speech in spring boot book",
//	  "category":"book",
//	  "author":"nikhil",
//	  "img":"nikhil.jpag"
//}

