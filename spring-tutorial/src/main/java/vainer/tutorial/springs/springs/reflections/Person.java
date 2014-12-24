package vainer.tutorial.springs.springs.reflections;

public class Person {

	private String name;
	private String family;

	public Person(String שם, String משפחה) {
		this.name = שם;
		this.family = משפחה;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFamily() {
		return family;
	}

	public void setFamily(String family) {
		this.family = family;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", family=" + family + "]";
	}
	
	

}
