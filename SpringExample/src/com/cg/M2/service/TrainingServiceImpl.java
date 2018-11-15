package com.cg.M2.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.M2.DAO.ITrainingDAO;
import com.cg.M2.DAO.TrainingDAOImpl;
import com.cg.M2.dto.Client;
import com.cg.M2.exception.SessionException;

@Service("service")
@Transactional
public class TrainingServiceImpl implements ITrainingService {
	
	/*
	 * Making a link between service and the DAO layer using Autowired annotation
	 */
	@Autowired
	ITrainingDAO dao;

	/*
	 * This method retrieves the entire list of available sessions from the database from the dao layer
	 * and return the list to the controller class
	 */
	@Override
	public List<Client> getAllSessions() throws SessionException {
		// TODO Auto-generated method stub
		return dao.getSessions();
	}

}
