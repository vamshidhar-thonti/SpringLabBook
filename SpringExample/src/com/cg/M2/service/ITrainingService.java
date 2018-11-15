package com.cg.M2.service;

import java.util.List;

import com.cg.M2.dto.Client;
import com.cg.M2.exception.SessionException;

public interface ITrainingService {
	
	public List<Client> getAllSessions() throws SessionException;

}
