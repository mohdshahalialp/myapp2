package com.sbi.human.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sbi.human.dao.HHPersonalDetailsDAO;
import com.sbi.human.entity.HHPersonalDetailsEntity;

@Service
public class HHPersonalDetailsService implements IHHPersonalDetailsService{
	@Autowired
	private HHPersonalDetailsDAO dao;

	@Override
	public HHPersonalDetailsEntity getInfoById(Integer id) {
		return dao.findOne(id);
	}
	
	

	
}
