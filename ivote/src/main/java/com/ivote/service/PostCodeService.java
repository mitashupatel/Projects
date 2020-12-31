package com.ivote.service;

import java.util.List;
import com.ivote.bean.Constituencies;
import com.ivote.bean.PostCode;
import com.ivote.bean.Regions;

public interface PostCodeService {

	public long saveUpdatePostCode(PostCode ad);
	public PostCode editPostCode(long id);
	public boolean deletePostCode(long id);
	public List<PostCode> getAll();
}
