package ca.centennialcollege;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PizzaController {
	@RequestMapping("/placeOrder")
	public ModelAndView placeOrder(HttpServletRequest request, HttpServletResponse response) {
		//ApplicationContext ctx = new ClassPathXmlApplicationContext("WebContent/WEB-INF/dispatcher-servlet.xml");
		WebApplicationContext ctx = WebApplicationContextUtils.getWebApplicationContext(request.getServletContext());
		PizzaBean pizzaBean = ctx.getBean("PizzaBean", PizzaBean.class);
		
		pizzaBean.setFirstName(request.getParameter("firstName"));
		pizzaBean.setLastName(request.getParameter("lastName"));
		pizzaBean.setStreetAddress(request.getParameter("streetAddress"));
		pizzaBean.setStreetAddressLine2(request.getParameter("streetAddressLine2"));
		//pizzaBean.setPostalCode(request.getParameter("postalCode"));
		//pizzaBean.setEmail(request.getParameter("email"));
		
		//String firstName = request.getParameter("firstName");
		//String lastName = request.getParameter("lastName");
		//String streetAddress = request.getParameter("streetAddress");
		ModelAndView view = new ModelAndView("show_details");
		view.addObject("pizzaB", pizzaBean);
		return view;
	}
}
