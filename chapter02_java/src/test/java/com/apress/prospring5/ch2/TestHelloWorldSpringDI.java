package test.java.com.apress.prospring5.ch2;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import main.java.com.apress.prospring5.ch2.decoupled.MessageRenderer;

/**
 * Created by iuliana.cosmina on 1/28/17.
 */
public class TestHelloWorldSpringDI {

	@Test
	public void testHello() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext
				("spring/app-context.xml");
		MessageRenderer mr = ctx.getBean("renderer", MessageRenderer.class);
		assertNotNull(mr);
	}
}
