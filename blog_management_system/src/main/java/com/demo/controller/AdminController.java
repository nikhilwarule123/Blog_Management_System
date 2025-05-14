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
@RequestMapping("/admin")
@CrossOrigin(origins="http://localhost:3000")

public class AdminController {
	@Autowired 
	BlogService brsp;
	
	@PostMapping("/adminsave")//http://localhost:8080/admin/adminsave
	public String save(@RequestBody Blog b) {
		return brsp.save(b);
	}
	
	@GetMapping("/findall")//http://localhost:8080/admin/findall
	public List findall() {
		return brsp.findall();
	}
	
	@GetMapping("/empdata/{id}")//http://localhost:8080/admin/empdata/4
	public Blog findbyid(@PathVariable int id) {
		return brsp.findbyid(id);
	}
	
	@DeleteMapping("/delete/{id}")//http://localhost:8080/admin/delete/4
	public String deletebyid(@PathVariable int id) {
		return brsp.deletebyid(id);
	}
	
	@PutMapping("/update/{id}")//http://localhost:8080/admin/update/3
	public String update(@PathVariable int id,@RequestBody Blog newBlog) {
		return brsp.updateBlog(id, newBlog);
	}

}
