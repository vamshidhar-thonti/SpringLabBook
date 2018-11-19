package com.cg.purchase.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cg.purchase.dto.Mobile;
import com.cg.purchase.service.MobileService;

@Controller
public class MobileController {
	
	@Autowired
	MobileService mobileservice;
	
	@RequestMapping(value = "/all")
	public ModelAndView getALlMobiles() {
		List<Mobile> list = mobileservice.getAll();
		return new ModelAndView("purchase", "data", list);
	}
	
	@RequestMapping(value = "/disp", method = RequestMethod.POST)
	public ModelAndView display(@ModelAttribute("my") Mobile mob) {
		return new ModelAndView("success", "info", mob.getMobName());
	}

}
