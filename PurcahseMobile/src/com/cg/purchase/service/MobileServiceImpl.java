package com.cg.purchase.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.purchase.DAO.MobileDAO;
import com.cg.purchase.dto.Mobile;

@Service("mobileservice")
public class MobileServiceImpl implements MobileService {
	
	@Autowired
	MobileDAO mobiledao;
	
	@Override
	public List<Mobile> getAll() {
		// TODO Auto-generated method stub
		return mobiledao.getAll();
	}

}
