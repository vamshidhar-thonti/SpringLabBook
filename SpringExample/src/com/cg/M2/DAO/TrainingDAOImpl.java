package com.cg.M2.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.cg.M2.dto.Client;
import com.cg.M2.exception.SessionException;

@Repository("dao")
public class TrainingDAOImpl implements ITrainingDAO {
	
	@PersistenceContext
	EntityManager em;
	
	/*
	 * Using createQuery method the entire list has been retrieved from the database and
	 * stored in a list.
	 * Further it will be returned to the service layer
	 */
	@Override
	public List<Client> getSessions() throws SessionException {
		// TODO Auto-generated method stub
		Query query = em.createQuery("from Client");
		List<Client> list = query.getResultList();
		if(list == null)
			throw new SessionException("Database is empty...");
		return list;
	}

}
