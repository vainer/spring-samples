package vainer.tutorial.springs.springs.quoter;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainQuoter {
	
	public static void main(String[] args) throws InterruptedException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		while (true) {
			Thread.sleep(100);
			context.getBean(Quoter.class).sayQuote();
		}
	}

}
