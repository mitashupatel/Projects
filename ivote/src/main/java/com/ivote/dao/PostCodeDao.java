package com.ivote.dao;

import java.util.List;

import com.ivote.bean.Admin;
import com.ivote.bean.Constituencies;
import com.ivote.bean.PostCode;

public interface PostCodeDao extends GenericDAO<PostCode> {

	public PostCode saveUpdatePostCode(PostCode postCode);

	public PostCode editPostCode(long id);

	public boolean deletePostCode(long id);

	public List<PostCode> getAll();


}
