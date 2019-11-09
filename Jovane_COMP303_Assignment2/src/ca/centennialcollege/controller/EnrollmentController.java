package ca.centennialcollege.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ca.centennialcollege.model.Enrollment;
import ca.centennialcollege.model.Program;
import ca.centennialcollege.model.Student;
import ca.centennialcollege.service.EnrollmentService;
import ca.centennialcollege.service.ProgramService;

@Controller
public class EnrollmentController {
	@RequestMapping("/checkout")
	public ModelAndView checkout(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
		ModelAndView view = new ModelAndView("checkout");
		Enrollment enrollment = new Enrollment();
		ProgramService programService = new ProgramService();
		EnrollmentService enrollmentService = new EnrollmentService();
		Program program = programService.findOne(request.getParameter("rdProg"));
		Student student = ((Student) session.getAttribute("student"));
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
}
