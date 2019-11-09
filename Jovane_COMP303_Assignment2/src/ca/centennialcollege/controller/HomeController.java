package ca.centennialcollege.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.servlet.ModelAndView;

import ca.centennialcollege.model.Enrollment;
import ca.centennialcollege.model.Program;
import ca.centennialcollege.model.Student;
import ca.centennialcollege.service.EnrollmentService;
import ca.centennialcollege.service.ProgramService;
import ca.centennialcollege.service.StudentService;

@Controller
public class HomeController {
	private static Student studentLoggedIn = null;
	private StudentService studentService = new StudentService();

	@RequestMapping("/index")
	public ModelAndView index(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
		ModelAndView view = null;
		Student student = ((Student)session.getAttribute("student"));
		if (student == null) {
			view = new ModelAndView("login");
		} else {
			ProgramService programService = new ProgramService();
			List<Program> programs = programService.findAll();
			view = new ModelAndView("program");
			view.addObject("username", getStudentloggedin().getUsername());
			view.addObject("programs", programs);
			view = new ModelAndView("program");
		}
		return view;
	}

	@RequestMapping("/signup")
	public ModelAndView signup(HttpServletRequest request, HttpServletResponse response) {
		return new ModelAndView("signup");
	}

	@RequestMapping("/checkout")
	public ModelAndView checkout(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
		ModelAndView view = new ModelAndView("checkout");
		Enrollment enrollment = new Enrollment();
		ProgramService programService = new ProgramService();
		EnrollmentService enrollmentService = new EnrollmentService();
		Program program = programService.findOne(request.getParameter("rdProg"));
		Student student = ((Student)session.getAttribute("student"));
		enrollment.setProgramCode(program.getProgramCode());
		enrollment.setStudentId(student.getStudentId());
		enrollment.setAmountPaid(program.getFee());
		enrollment.setStatus("In progress");
		enrollment.setStartDate(new Date());
		Enrollment newEnrollment = enrollmentService.save(enrollment);
		view.addObject("newEnrollment", newEnrollment);
		// String paymentMethod = request.getParameter("payment");
		return view;
	}

	@RequestMapping("/profile")
	public ModelAndView profile(HttpServletRequest request, HttpServletResponse response) {
		return new ModelAndView("profile", "student", getStudentloggedin());
	}

	@RequestMapping("/stu_edit")
	public ModelAndView stu_edit(HttpServletRequest request, HttpServletResponse response) {
		Student student = new Student();
		student.setStudentId(getStudentloggedin().getStudentId());
		student.setAddress(request.getParameter("address"));
		student.setCity(request.getParameter("city"));
		student.setPostalCode(request.getParameter("postalCode"));
		Student newStudent = studentService.save(student);
		ModelAndView view = new ModelAndView("program");
		setStudentloggedin(newStudent);
		return view;
	}

	@RequestMapping("/signin")
	public ModelAndView signin(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
		ModelAndView view = null;
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		Student stu = studentService.findByUsernameAndPassword(username, password);
		if (stu != null) {
			//studentLoggedIn = stu;
			session.setAttribute("student", stu);
			ProgramService programService = new ProgramService();
			List<Program> programs = programService.findAll();
			view = new ModelAndView("program");
			view.addObject("username", username);
			view.addObject("programs", programs);
		} else {
			view = new ModelAndView("login");
		}
		return view;
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
		Student newStudent = studentService.save(student);
		ModelAndView view = new ModelAndView("login");
		view.addObject("newStudent", newStudent);
		return view;
	}

	public static Student getStudentloggedin() {
		return studentLoggedIn;
	}

	public static void setStudentloggedin(Student student) {
		studentLoggedIn = student;
	}
}
