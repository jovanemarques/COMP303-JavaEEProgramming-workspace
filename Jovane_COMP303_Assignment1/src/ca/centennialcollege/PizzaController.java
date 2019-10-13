package ca.centennialcollege;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PizzaController {
	//controller action
	@RequestMapping("/placeOrder")
	public ModelAndView placeOrder(HttpServletRequest request, HttpServletResponse response) {
		WebApplicationContext ctx = WebApplicationContextUtils.getWebApplicationContext(request.getServletContext());
		// getting the bean from spring context
		PizzaBean pizzaBean = ctx.getBean("PizzaBean", PizzaBean.class);

		//setting the bean with the info from the index page
		pizzaBean.setFirstName(request.getParameter("firstName"));
		pizzaBean.setLastName(request.getParameter("lastName"));
		pizzaBean.setStreetAddress(request.getParameter("streetAddress"));
		pizzaBean.setStreetAddressLine2(request.getParameter("streetAddressLine2"));
		pizzaBean.setProvince(request.getParameter("province"));
		pizzaBean.setPostalCode(request.getParameter("postalCode"));
		pizzaBean.setPhoneNumber(request.getParameter("phoneNumber"));
		pizzaBean.setEmail(request.getParameter("email"));
		pizzaBean.setToppings(request.getParameterValues("toppings"));
		pizzaBean.setPayment(request.getParameter("payments"));

		ModelAndView view = new ModelAndView("show_details");
		// sending the bean to the view page
		view.addObject("pizzaB", pizzaBean);
		return view;
	}
}
