package ca.centennialcollege.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ca.centennialcollege.model.Program;
import ca.centennialcollege.service.ProgramService;

@Controller
public class ProgramController {
//	@RequestMapping("/program")
//	public ModelAndView program(HttpServletRequest request, HttpServletResponse response) {
//		ProgramService programService = new ProgramService();
//		List<Program> programs = programService.findAll();
//		ModelAndView view = new ModelAndView("program");
//		view.addObject("programs", programs);
//		return view;
//	}
}
