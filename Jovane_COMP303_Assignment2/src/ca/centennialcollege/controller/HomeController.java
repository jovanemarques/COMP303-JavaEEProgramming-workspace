package ca.centennialcollege.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ca.centennialcollege.model.Program;
import ca.centennialcollege.model.Student;
import ca.centennialcollege.service.ProgramService;
import ca.centennialcollege.service.StudentService;

@Controller
public class HomeController {

	@RequestMapping("/index")
	public ModelAndView index(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
		ModelAndView view = null;
		Student student = ((Student) session.getAttribute("student"));
		if (student == null) {
			view = new ModelAndView("login");
		} else {
			ProgramService programService = new ProgramService();
			List<Program> programs = programService.findAll();
			view = new ModelAndView("program");
			view.addObject("programs", programs);
		}
		return view;
	}

	@RequestMapping("/signup")
	public ModelAndView signup(HttpServletRequest request, HttpServletResponse response) {
		return new ModelAndView("signup");
	}

	@RequestMapping("/signin")
	public ModelAndView signin(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
		ModelAndView view = null;
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		StudentService studentService = new StudentService();
		Student stu = studentService.findByUsernameAndPassword(username, password);
		if (stu != null) {
			// studentLoggedIn = stu;
			session.setAttribute("student", stu);
			ProgramService programService = new ProgramService();
			List<Program> programs = programService.findAll();
			view = new ModelAndView("program");
			view.addObject("username", username);
			view.addObject("programs", programs);
		} else {
			view = new ModelAndView("login");
			view.addObject("msg_fail", "Login fail");
		}
		return view;
	}

	@RequestMapping("/signout")
	public ModelAndView signout(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
		session.removeAttribute("student");
		return new ModelAndView("login");
	}

}
