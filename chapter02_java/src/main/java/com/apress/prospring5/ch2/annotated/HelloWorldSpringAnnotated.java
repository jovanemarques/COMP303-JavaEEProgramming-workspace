package main.java.com.apress.prospring5.ch2.annotated;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import main.java.com.apress.prospring5.ch2.decoupled.MessageRenderer;

/**
 * Created by iuliana.cosmina on 1/28/17.
 */
public class HelloWorldSpringAnnotated {

	public static void main(String... args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext
				(HelloWorldConfiguration.class);
		MessageRenderer mr = ctx.getBean("renderer", MessageRenderer.class);
		mr.render();
	}
}
