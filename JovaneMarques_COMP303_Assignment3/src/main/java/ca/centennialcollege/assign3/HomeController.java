package ca.centennialcollege.assign3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/test.html")
	public String home() {
		return "This is my REST Web Service Implementation";
	}
}