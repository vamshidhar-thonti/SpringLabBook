package com.cg.M2.DAO;

import java.util.List;

import com.cg.M2.dto.Client;
import com.cg.M2.exception.SessionException;

public interface ITrainingDAO {
	
	public List<Client> getSessions() throws SessionException;

}
