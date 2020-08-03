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
	
	public void join(AADto dto) {
		aaDao.select();
		aaDao.insert(dto);
	}

	public List<AADto> selectAll() {
		return aaDao.select();
	}
	
	public void update(AADto dto) {
		aaDao.update(dto);
	}
	
}
