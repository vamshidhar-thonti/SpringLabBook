package com.cg.purchase.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.cg.purchase.dto.Mobile;

@Repository("mobiledao")
public class MobileDAOImpl implements MobileDAO {
	
	@PersistenceContext
	EntityManager em;
	
	@Override
	public List<Mobile> getAll() {
		// TODO Auto-generated method stub
		Query query = em.createQuery("from Mobile");
		List<Mobile> list = query.getResultList();
		return list;

	}

}
