package com.admin.dao;

import java.util.List;


import com.admin.model.Blog;

public interface BlogDao extends GenericDAO<Blog>{
		
	public long saveUpdateBlog(Blog blog);
	
	public Blog editBlog(long blogId);
	
	public boolean deleteBlog(long blogId);
	
	public List<Blog> getAll();
}
