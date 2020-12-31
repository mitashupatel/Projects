package com.admin.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;
import com.admin.dao.BlogDao;
import com.admin.model.Blog;
import com.admin.service.BlogService;
import com.admin.utills.FTPUtils;
import com.admin.utills.FileUtils;


@Service("blogService")
@Transactional
public class BlogServiceImpl implements BlogService {
	
	@Autowired
	BlogDao blogDao;
	
	private static String UPLOADED_FOLDER1 = "F://Tools//apache-tomcat-9.0.30-windows-x64//apache-tomcat-9.0.30//webapps//eximoo//resources//images//admin//";
	
	public long saveUpdateBlog(Blog blog, MultipartFile file) {
		String newFileName = FileUtils.getFileName(file.getOriginalFilename());
		String newFileName1 = FileUtils.getFileName(file.getOriginalFilename());
	    long blogId = 0;
		blog.setIsActive(1);
		blog.setPhoto1(newFileName);
		blog.setPhoto2(newFileName1);
		if (blog.getBlogId() == 0) {
			
			blogId = blogDao.saveUpdateBlog(blog);
		}
		else {
			blogId = blogDao.saveUpdateBlog(blog);
		}
		if(blog != null)
		{
			FileUtils.uploadImageFile(file, UPLOADED_FOLDER1+newFileName);
			FTPUtils.uploadOnFTP(UPLOADED_FOLDER1+newFileName, newFileName);
			
			FileUtils.uploadImageFile(file, UPLOADED_FOLDER1+newFileName1);
			FTPUtils.uploadOnFTP(UPLOADED_FOLDER1+newFileName1, newFileName1);
			
		}
		
		return blogId;
	}

	public Blog editBlog(long blogId) {
		return blogDao.editBlog(blogId);
	}

	public boolean deleteBlog(long blogId) {
		return blogDao.deleteBlog(blogId);
	}

	public List<Blog> getAll() {
		List<Blog> BlogList = blogDao.getAll();
		/*for (Blog Blog) {
			String fileName = Blog.getPhoto1();
			File file = new File(UPLOADED_FOLDER1+fileName);
			if(!file.exists())
			{
				FTPUtils.download(fileName, UPLOADED_FOLDER1+fileName);
			}
		}*/
		return BlogList;
	}

}
