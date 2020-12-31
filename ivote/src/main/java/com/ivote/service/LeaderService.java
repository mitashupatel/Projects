package com.ivote.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.ivote.bean.Leader;

public interface LeaderService {

	public long saveUpdateLeader(Leader ad, MultipartFile file);
	public Leader editLeader(long id);
	public boolean deleteLeader(long id);
	public List<Leader> getAll();
}
