package main.java.com.apress.prospring5.ch2.annotated;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import main.java.com.apress.prospring5.ch2.decoupled.HelloWorldMessageProvider;
import main.java.com.apress.prospring5.ch2.decoupled.MessageProvider;
import main.java.com.apress.prospring5.ch2.decoupled.MessageRenderer;
import main.java.com.apress.prospring5.ch2.decoupled.StandardOutMessageRenderer;

/**
 * Created by iuliana.cosmina on 1/28/17.
 */
@Configuration
public class HelloWorldConfiguration {

	@Bean
	public MessageProvider provider() {
		return new HelloWorldMessageProvider();
	}

	@Bean
	public MessageRenderer renderer(){
		MessageRenderer renderer = new StandardOutMessageRenderer();
		renderer.setMessageProvider(provider());
		return renderer;
	}
}
