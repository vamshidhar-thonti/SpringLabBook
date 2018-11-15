package com.cg.springMVCOne.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.springMVCOne.dao.MobileDAO;
import com.cg.springMVCOne.dto.Mobile;

@Service("mobileservice")
@Transactional //It enables <tx:annotation-driven transaction-manager="transactionManager"/>
public class MobileServiceImpl implements MobileService {
	
	@Autowired
	MobileDAO mobiledao;
	@Override
	public void addMobiles(Mobile mobile) {
		// TODO Auto-generated method stub
		mobiledao.addMobiles(mobile);
	}

	@Override
	public List<Mobile> showAllMobiles() {
		// TODO Auto-generated method stub
		return mobiledao.showAllMobiles();
	}

	@Override
	public void deleteMobile(int mobid) {
		// TODO Auto-generated method stub
		mobiledao.deleteMobile(mobid);
	}

	@Override
	public Mobile searchMobile(int mobid) {
		// TODO Auto-generated method stub
		return mobiledao.searchMobile(mobid);
	}

	@Override
	public void updateMobile(Mobile mobile) {
		// TODO Auto-generated method stub
		mobiledao.updateMobile(mobile);
		
	}

}
