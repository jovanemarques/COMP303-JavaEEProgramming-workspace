package ca.centennialcollege.assign3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JovaneComp303Assignment3Application {

	public static void main(String[] args) {
		SpringApplication.run(JovaneComp303Assignment3Application.class, args);
		System.out.println("REST service started...");
	}

//	@Bean
//	public ApplicationRunner passengersInitializer(PassengerService bookService) {
//		return args -> {
//			bookService.create(new Passenger(1, "Jovane", "Marques"));
//			bookService.create(new Passenger(2, "Larissa", "Bastos"));
//		};
//
//	}

}
