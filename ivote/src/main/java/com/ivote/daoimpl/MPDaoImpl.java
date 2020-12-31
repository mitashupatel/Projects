package com.ivote.daoimpl;

import java.util.List;
import org.springframework.stereotype.Repository;
import com.ivote.bean.MP;
import com.ivote.dao.MPDao;

@Repository("mpDao")
public class MPDaoImpl extends GenericDaoImpl<MP> implements MPDao {

	public MP saveUpdateMP(MP MP) {
		return super.saveUpdateObject(MP);
	}

	public MP editMP(long id) {
		return super.getById(MP.class, id);
	}

	public List<MP> getAll() {
		return (List<MP>) super.getByQuery("FROM MP a WHERE a.isDeleted=0");
	}

	public boolean deleteMP(long id) {
		MP mp = super.getById(MP.class, id);
		mp.setIsDeleted(1);
		return super.updateObject(mp).getMpId() > 0;
	}
}
