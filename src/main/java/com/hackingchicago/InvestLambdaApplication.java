package com.hackingchicago;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@SpringBootApplication
//@Configuration
//@EnableAutoConfiguration
//@ComponentScan(basePackages = { "com.hackingchicago" })
public class InvestLambdaApplication {

	// public static void main(String[] args) {
	// SpringApplication.run(InvestLambdaApplication.class, args);
	// }

	private static ApplicationContext springContext = null;

	private static ApplicationContext getSpringContext() {
		if (springContext == null) {
			synchronized (ApplicationContext.class) {
				if (springContext == null) {
					springContext = new ClassPathXmlApplicationContext("/application-context.xml");
					System.out.println("spring context created");
					System.out.println(springContext.getBeanDefinitionCount());
					System.out.println("app name= "+springContext.getApplicationName());
				}
			}
		}
		return springContext;
	}

	public static <T> T getBean(Class<T> clazz) {
		return getSpringContext().getBean(clazz);
	}
}
