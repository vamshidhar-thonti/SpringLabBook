package com.cg.springMVCOne.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cg.springMVCOne.dto.Mobile;
import com.cg.springMVCOne.service.MobileService;

@Controller
public class MobileController {

	@Autowired
	MobileService mobileservice;

	@RequestMapping(value = "/home")
	public String getAllMobiles(@ModelAttribute("my") Mobile mob,
			Map<String, Object> model) {

		List<String> list = new ArrayList<String>();
		list.add("IPhone");
		list.add("Redmi");
		list.add("OnePlus");
		list.add("Dabba Wala");

		model.put("cato", list);

		return "AddMobile";
	}

	@RequestMapping(value = "addData", method = RequestMethod.POST)
	public String addMobileData(@Valid @ModelAttribute("my") Mobile mobile,
			BindingResult result, Map<String, Object> model) {
		// System.out.println(mobile);
		if (result.hasErrors()) {
			List<String> list = new ArrayList<String>();
			list.add("IPhone");
			list.add("Redmi");
			list.add("OnePlus");
			list.add("Dabba Wala");

			model.put("cato", list);
			return "AddMobile";
		} else {
			mobileservice.addMobiles(mobile);
			return "success";
		}
	}

	@RequestMapping(value = "showAll", method = RequestMethod.GET)
	public ModelAndView showAllMobilesData() {
		List<Mobile> list = mobileservice.showAllMobiles();
		return new ModelAndView("mobileShow", "data", list);
	}

	@RequestMapping(value = "searchMobile", method = RequestMethod.GET)
	public String searchMobile(@ModelAttribute("me") Mobile mob) {
		return "searchMobile";
	}

	@RequestMapping(value = "mobileSearchData", method = RequestMethod.POST)
	public ModelAndView dataSearch(@ModelAttribute("me") Mobile mob) {
		Mobile mobSearch = mobileservice.searchMobile(mob.getMobId());
		return new ModelAndView("mobileDataSearch", "searchedData", mobSearch);
	}

	@RequestMapping(value = "deleteMobile", method = RequestMethod.GET)
	public String deleteID(@ModelAttribute("meId") Mobile mob) {
		return "deleteId";
	}

	@RequestMapping(value = "FinalDelete", method = RequestMethod.POST)
	public String deletedID(@ModelAttribute("meId") Mobile mob) {
		System.out.println(mob.getMobId());
		mobileservice.deleteMobile(mob.getMobId());
		return "deletedID";
	}

	@RequestMapping(value = "updateMobile", method = RequestMethod.GET)
	public String updateID(@ModelAttribute("upId") Mobile mob) {
		return "updateId";
	}

	@RequestMapping(value = "updateDB", method = RequestMethod.POST)
	public String IDUpdated(@ModelAttribute("upId") Mobile mob) {
		System.out.println(mob.getMobName());
		mobileservice.updateMobile(mob);
		return "Updated";
	}

}
