package ca.centennialcollege.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.servlet.ModelAndView;

import ca.centennialcollege.model.Student;
import ca.centennialcollege.service.StudentService;

@Controller
public class HomeController {
	private static final Student studentLoggedIn = null;

	@RequestMapping("/index")
	public ModelAndView index(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView view = null;
		if (studentLoggedIn == null) {
			view = new ModelAndView("login");
		} else {
			view = new ModelAndView("program");
		}
		return view;
	}

	@RequestMapping("/signup")
	public ModelAndView signup(HttpServletRequest request, HttpServletResponse response) {
		return new ModelAndView("signup");
	}

	@RequestMapping("/signin")
	public ModelAndView signin(HttpServletRequest request, HttpServletResponse response) {
		String view = null;
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		if (username.equals("a") && password.equals("1")) {
			view = "program";
		} else {
			view = "login";
		}
		return new ModelAndView(view);
	}

	@RequestMapping("/register")
	public ModelAndView register(HttpServletRequest request, HttpServletResponse response) {
		WebApplicationContext ctx = WebApplicationContextUtils.getWebApplicationContext(request.getServletContext());
		// getting the bean from spring context
		Student student = ctx.getBean("Student", Student.class);
		student.setUsername(request.getParameter("username"));
		student.setPassword(request.getParameter("password"));
		student.setFirstName(request.getParameter("firstName"));
		student.setLastName(request.getParameter("lastName"));
		student.setAddress(request.getParameter("address"));
		student.setCity(request.getParameter("city"));
		student.setPostalCode(request.getParameter("postalCode"));
		StudentService studentService = new StudentService();
		Student newStudent = studentService.save(student);
		ModelAndView view = new ModelAndView("login");
		view.addObject("newStudent", newStudent);
		return view;
	}
}
