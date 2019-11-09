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
public class StudentController {
	private StudentService studentService = new StudentService();

	@RequestMapping("/stu_edit")
	public ModelAndView stu_edit(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
		Student student = ((Student) session.getAttribute("student"));
		Student stu = ((Student) session.getAttribute("student"));
		student.setStudentId(stu.getStudentId());
		student.setFirstName(request.getParameter("firstName"));
		student.setLastName(request.getParameter("lastName"));
		student.setPassword(request.getParameter("password"));
		student.setUsername(request.getParameter("username"));
		student.setAddress(request.getParameter("address"));
		student.setCity(request.getParameter("city"));
		student.setPostalCode(request.getParameter("postalCode"));
		Student newStudent = studentService.save(student);
		session.setAttribute("student", newStudent);
		ProgramService programService = new ProgramService();
		List<Program> programs = programService.findAll();
		ModelAndView view = new ModelAndView("program");
		view.addObject("programs", programs);
		return view;
	}

	@RequestMapping("/register")
	public ModelAndView register(HttpServletRequest request, HttpServletResponse response) {
		Student student = new Student();
		student.setUsername(request.getParameter("username"));
		student.setPassword(request.getParameter("password"));
		student.setFirstName(request.getParameter("firstName"));
		student.setLastName(request.getParameter("lastName"));
		student.setAddress(request.getParameter("address"));
		student.setCity(request.getParameter("city"));
		student.setPostalCode(request.getParameter("postalCode"));
		Student newStudent = studentService.save(student);
		ModelAndView view = new ModelAndView("login");
		view.addObject("newStudent", newStudent);
		return view;
	}
	
	@RequestMapping("/profile")
	public ModelAndView profile(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
		Student student = ((Student) session.getAttribute("student"));
		return new ModelAndView("profile", "student", student);
	}
}
