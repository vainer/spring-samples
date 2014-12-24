package vainer.tutorial.springs.springs.reflections;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainPerson {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context-person.xml");
		Person person = context.getBean(Person.class);
		System.out.println("" + person.toString());
		
	}

}
