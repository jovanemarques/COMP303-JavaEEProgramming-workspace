package ca.centennialcollege.assign3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ca.centennialcollege.assign3.service.FlightService;

//@RestController //used for pure rest services
@Controller // used for thymeleaf templates
public class FlightController {
	private final FlightService flightService;

	public FlightController(FlightService fs) {
		this.flightService = fs;
	}

//	@GetMapping("/")
//	public String index() {
//		return "OK";
//	}
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("flights", flightService.findAll());
		//list flights
		return "index";
	}
}
