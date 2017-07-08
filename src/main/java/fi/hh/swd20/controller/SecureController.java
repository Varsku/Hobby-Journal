package fi.hh.swd20.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/harrastus")
public class SecureController {

	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public String paasivu(Model model) {
		return "harrastus/main";
	}

}
