package com.admin.daoimpl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.admin.dao.BlogDao;
import com.admin.model.Admin;
import com.admin.model.Blog;

@Repository("blogDao")
public class BlogDaoImpl extends GenericDaoImpl<Blog> implements BlogDao{

	public long saveUpdateBlog(Blog blog) {
		return super.saveUpdateObject(blog).getBlogId();
	}

	public Blog editBlog(long blogId) {
		return super.getById(Blog.class, blogId);
	}

	public boolean deleteBlog(long blogId) {
		Blog blog = super.getById(Blog.class, blogId);
		blog.setIsDeleted(1);
		return super.updateObject(blog).getBlogId()> 0;
	}

	public List<Blog> getAll() {
		return (List<Blog>) super.getByQuery("FROM Blog a WHERE isDeleted=0");
	}

}
