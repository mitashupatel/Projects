package com.ivote.daoimpl;

import java.util.List;
import org.springframework.stereotype.Repository;
import com.ivote.bean.PostCode;
import com.ivote.dao.PostCodeDao;
import com.ivote.utils.DbUtility;

@Repository("postCodeDao")
public class PostCodeDaoImpl extends GenericDaoImpl<PostCode> implements PostCodeDao {

	public PostCode saveUpdatePostCode(PostCode postCode) {
		return super.saveUpdateObject(postCode);
	}

	public PostCode editPostCode(long id) {
		return super.getById(PostCode.class, id);
	}

	public List<PostCode> getAll() {
		String query = "Select post.postCodeId, post.postCodeName, c.constituencyId, c.constituencyName, n.nationId, n.nationName, r.regionId, r.regionName from postcode post  "
				+ "inner join constituencies c on post.constituencyId = c.constituencyId "
				+ "INNER JOIN nations n ON post.nationId = n.nationId "
				+ "INNER JOIN regions r ON post.regionId = r.regionId WHERE post.isDeleted = 0"; 
		return DbUtility.getListData(query, PostCode.class);
	}

	public boolean deletePostCode(long id) {
		PostCode postCode = super.getById(PostCode.class, id);
		postCode.setIsDeleted(1);
		return super.updateObject(postCode).getPostCodeId() > 0;
	}

}
