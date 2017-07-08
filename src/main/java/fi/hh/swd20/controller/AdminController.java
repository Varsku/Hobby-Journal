package fi.hh.swd20.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


import fi.hh.swd20.dao.HarrastusDAO;




@Controller
@RequestMapping(value="/harrastus/admin")
public class AdminController {
	
	@Inject
	private HarrastusDAO dao;
	
	public HarrastusDAO getDao() {
		return dao;	
	}
	
	public void setDao(HarrastusDAO dao) {
		this.dao=dao;
	}

	@RequestMapping (value="poista", method= RequestMethod.GET)
	public String getPoistaHarrastus(Model model) {
		return "harrastus/admin/poistaHarrastus";
	}
	
	@RequestMapping (value="poista", method= RequestMethod.POST)
	public String poistaTietty(Model model, @RequestParam("id")int id) {
	dao.poista(id);
	return "harrastus/admin/viewPoistettu";
	}
		
}