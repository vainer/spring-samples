package vainer.tutorial.springs.jackson.fastermxl.model;

public class Key {

	private String name;
	private String nameSpace;

	public Key() {
	}

	public Key(String name, String nameSpace) {
		super();
		this.name = name;
		this.nameSpace = nameSpace;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNameSpace() {
		return nameSpace;
	}

	public void setNameSpace(String nameSpace) {
		this.nameSpace = nameSpace;
	}

	@Override
	public String toString() {
		return "Key [name=" + name + ", nameSpace=" + nameSpace + "]";
	}

}
