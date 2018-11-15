package com.cg.springMVCOne.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.cg.springMVCOne.dto.Mobile;

@Repository("mobiledao")
public class MobileDAOImpl implements MobileDAO {
	
	@PersistenceContext
	EntityManager em;

	@Override
	public void addMobiles(Mobile mobile) {
		// TODO Auto-generated method stub
		em.persist(mobile);
		em.flush();
	}

	@Override
	public List<Mobile> showAllMobiles() {
		// TODO Auto-generated method stub
		Query query = em.createQuery("FROM Mobile");
		List<Mobile> MobileList = query.getResultList();
//		String qry = "select mob from Mobile mob";
//		TypedQuery<Mobile> allMobiles = em.createQuery(qry, Mobile.class);
		return MobileList;
	}

	@Override
	public void deleteMobile(int mobid) {
		// TODO Auto-generated method stub
		Query query = em.createQuery("delete Mobile where mobId = :mobData");
		query.setParameter("mobData", mobid);
		query.executeUpdate();
	}

	@Override
	public Mobile searchMobile(int mobid) {
		// TODO Auto-generated method stub
		Query query = em.createQuery("FROM Mobile where mobId = :mobData");
		query.setParameter("mobData", mobid);
		Mobile mob = (Mobile) query.getResultList().get(0);
		return mob;
	}

	@Override
	public void updateMobile(Mobile mobile) {
		// TODO Auto-generated method stub
		Query query = em.createQuery("update Mobile m set m.mobId = :mobID, m.mobName = :mobNAME,"
				+ "m.mobPrice = :mobPRICE, m.mobCategory = :mobCATEGORY,"
				+ "m.mobOnline = :mobONLINE");
		query.setParameter("mobID", mobile.getMobId());
		query.setParameter("mobNAME", mobile.getMobName());
		query.setParameter("mobPRICE", mobile.getMobPrice());
		query.setParameter("mobCATEGORY", mobile.getMobCategory());
		query.setParameter("mobONLINE", mobile.getMobOnline());
		query.executeUpdate();
	}

}
