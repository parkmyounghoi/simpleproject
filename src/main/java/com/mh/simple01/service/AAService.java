package com.mh.simple01.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mh.simple01.dao.AADao;
import com.mh.simple01.dto.AADto;

@Service
public class AAService {

	@Autowired
	AADao aaDao;
	
	public void join() {
		aaDao.select();
		aaDao.insert();
	}

	public List<AADto> selectAll() {
		return aaDao.select();
	}
	
}
