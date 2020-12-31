package com.ivote.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.ivote.bean.Party;

public interface PartyService {

	public long saveUpdateParty(Party ad, MultipartFile file);
	public Party editParty(long id);
	public boolean deleteParty(long id);
	public List<Party> getAll();
	public List<Party> getAllWithLeader();
}
