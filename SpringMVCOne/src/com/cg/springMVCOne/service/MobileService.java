package com.cg.springMVCOne.service;

import java.util.List;

import com.cg.springMVCOne.dto.Mobile;

public interface MobileService {
	
	public void addMobiles(Mobile mobile);
	public List<Mobile> showAllMobiles();
	public void deleteMobile(int mobid);
	public Mobile searchMobile(int mobid);
	public void updateMobile(Mobile moblie);

}
