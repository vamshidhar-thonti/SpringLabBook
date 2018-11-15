package com.cg.M2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cg.M2.dto.Client;
import com.cg.M2.exception.SessionException;
import com.cg.M2.service.ITrainingService;
import com.cg.M2.service.TrainingServiceImpl;

@Controller
public class TrainingController {
	
	/*
	 * Autowired is used to create make a connection with proceeding layers
	 */
	@Autowired
	ITrainingService service;
	
	/*
	 * This method will be called when the index.jsp redirects to home.
	 * It is used to get the entire list from the database and further redirects it to the ScheduledSessions.jsp page.
	 * Also it calls the getAlLSessions method which exists in service layer.
	 */
	@RequestMapping(value = "/home")
	public ModelAndView menuPage() {
		List<Client> list = null;
		try {
			list = service.getAllSessions();
		} catch (SessionException e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
		}
		return new ModelAndView("ScheduledSessions", "data", list);
	}
	
	/*
	 * Once the user enrolls a session it will be redirected here and displays a success info with the enrolled session name.
	 */
	@RequestMapping(value = "/done")
	public ModelAndView Success(@ModelAttribute("end") Client client) {
		return new ModelAndView("Success", "final", client.getName());
	}

}
