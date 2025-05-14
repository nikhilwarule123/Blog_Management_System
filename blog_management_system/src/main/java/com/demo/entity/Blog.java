package com.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="blogs")
public class Blog {
	@Id//set primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)//autuincrement

	 int id;
	 String title;
	 String subject;
	 String content;
	 String category;
	 String author;
	 String img;
	public Blog() {
		super();
	}
	public Blog(int id, String title, String subject, String content, String category, String author, String img) {
		super();
		this.id = id;
		this.title = title;
		this.subject = subject;
		this.content = content;
		this.category = category;
		this.author = author;
		this.img = img;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	
	 

}
