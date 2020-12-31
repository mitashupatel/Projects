package com.admin.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;


import com.admin.model.Blog;

public interface BlogService {

	public long saveUpdateBlog(Blog blog, MultipartFile file);
	public Blog editBlog(long blogId);
	public boolean deleteBlog(long blogId);
	public List<Blog> getAll();

}
