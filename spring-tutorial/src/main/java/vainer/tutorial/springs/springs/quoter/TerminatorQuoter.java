package vainer.tutorial.springs.springs.quoter;

import javax.annotation.PostConstruct;

@Profiling
public class TerminatorQuoter implements Quoter {
	
	@InjectRandomInt(min = 2, max = 7)
	private int repeate;

	private String message;
	
	@PostConstruct
	public void init() {
		System.out.println("phaze 2");
		System.out.println(repeate);
	}
	
	public TerminatorQuoter() {
		System.out.println("phaze 1");		
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public void sayQuote() {
		for (int i = 0; i < repeate; i++) {
			System.out.println(message);			
		}
	}

}
