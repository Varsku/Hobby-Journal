package fi.hh.swd20.controller;




import java.util.List;

import javax.inject.Inject;
import javax.validation.Valid;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import fi.hh.swd20.bean.Harrastus;
import fi.hh.swd20.bean.HarrastusImpl;
import fi.hh.swd20.dao.HarrastusDAO;





@Controller
@RequestMapping (value="/harrastus")
public class HarrastusController {
	
	@Inject
	private HarrastusDAO dao;
	
	public HarrastusDAO getDao() {
		return dao;	
	}
	
	public void setDao(HarrastusDAO dao) {
		this.dao=dao;
	}
	
	// UUSI HARRASTUS
	@RequestMapping (value="uusi", method= RequestMethod.GET)
	public String getLisaaHarrastus(Model model) {
		Harrastus tyhjaHarrastus = new HarrastusImpl();
		
		model.addAttribute("harrastus", tyhjaHarrastus);
		return "harrastus/lisaaHarrastus";
	}
	
	// VASTAANOTETAAN TIEDOT
	
	@RequestMapping(value="uusi", method=RequestMethod.POST)
	public String create( @ModelAttribute(value="harrastus") @Valid HarrastusImpl harrastus, BindingResult result) {
		if(result.hasErrors()) {
			return "harrastus/lisaaHarrastus";
		} else {
		dao.talleta(harrastus);
		return "redirect:/harrastus/" + harrastus.getId();
	}
	}
	
	// HARRASTUKSEN TIETOJEN N�YTT�
	@RequestMapping(value="{id}", method=RequestMethod.GET)
	public String getView(@PathVariable Integer id, Model model) {
		Harrastus harrastus = dao.etsi(id);
		model.addAttribute("harrastus", harrastus);
		return "harrastus/view";
	}
	
	//HAE TIETTY SIVU
	@RequestMapping (value="haku", method= RequestMethod.GET)
	public String getHaeHarrastus(Model model) {
		return "harrastus/haeHarrastus";
	}
	
	@RequestMapping (value="haku", method= RequestMethod.POST)
	public String postHaeTietty(Model model, @RequestParam("pvm")String pvm) {
		List<Harrastus> harrastus = dao.haeKaikki(pvm);
		model.addAttribute("harrastus", harrastus);
		return "harrastus/viewAll";
	}
	
}
