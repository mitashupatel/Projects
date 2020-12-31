package com.ivote.daoimpl;

import java.util.List;
import org.springframework.stereotype.Repository;

import com.ivote.bean.Admin;
import com.ivote.bean.Nations;
import com.ivote.dao.NationsDao;

@Repository("NationsDao")
public class NationsDaoImpl extends GenericDaoImpl<Nations> implements NationsDao {

	public Nations saveUpdateNations(Nations Nations) {
		return super.saveUpdateObject(Nations);
	}

	public Nations editNations(long id) {
		return super.getById(Nations.class, id);
	}

	public List<Nations> getAll() {
		return (List<Nations>) super.getByQuery("FROM Nations a WHERE a.isDeleted=0");
	}

	public boolean deleteNations(long id) {
		Nations Nations = super.getById(Nations.class, id);
		Nations.setIsDeleted(1);
		return super.updateObject(Nations).getNationId() > 0;
	}
}
