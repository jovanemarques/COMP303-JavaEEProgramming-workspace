package ca.centennialcollege.assign3;

import java.util.Date;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import ca.centennialcollege.assign3.model.Flight;
import ca.centennialcollege.assign3.model.Passenger;
import ca.centennialcollege.assign3.service.FlightService;
import ca.centennialcollege.assign3.service.PassengerService;

@SpringBootApplication
public class JovaneComp303Assignment3Application implements WebMvcConfigurer {

	public static void main(String[] args) {
		SpringApplication.run(JovaneComp303Assignment3Application.class, args);
		System.out.println("Service started...");
	}

//	@Override
//	public void addViewControllers(ViewControllerRegistry registry) {
//		registry.addViewController("/").setViewName("index");
//	}

	@Bean
	public ApplicationRunner fightsInitializer(FlightService flightService) {
		return args -> {
			flightService.create(new Flight(1, "AirCanada", "Toronto", "Rio de Janeiro", new Date(2019, 12, 1, 9, 0, 0),
					new Date(2019, 12, 2, 0, 0, 0), "12 hours", 220));
			flightService.create(new Flight(2, "Copa", "Toronto", "Panama", new Date(2019, 12, 1, 9, 0, 0),
					new Date(2019, 12, 1, 5, 0, 0), "8 hours", 130));
		};
	}

	@Bean
	public ApplicationRunner passengerInitializer(PassengerService passengerService) {
		return args -> {
			passengerService.create(new Passenger(1, "Jovane", "Marques", "123 Street Rd.", "Toronto", "Canada",
					"123-456-6789", "jovane@jovane.ca"));
			passengerService.create(new Passenger(1, "Larissa", "Bastos", "123 Street Rd.", "Toronto", "Canada",
					"123-456-9876", "larissa@larissa.ca"));
		};
	}

}
