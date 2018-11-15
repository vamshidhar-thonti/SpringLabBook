package com.cg.springMVCOne.dao;

import java.util.List;

import com.cg.springMVCOne.dto.Mobile;

public interface MobileDAO {
	
	public void addMobiles(Mobile mobile);
	public List<Mobile> showAllMobiles();
	public void deleteMobile(int mobid);
	public Mobile searchMobile(int mobid);
	public void updateMobile(Mobile moblie);

}
