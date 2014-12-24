package vainer.tutorial.springs.jackson.fastermxl.mapper;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import vainer.tutorial.springs.jackson.fastermxl.model.Container;

public class ToContainerTest {

	@Test
	public void toContainerTest() {
		String fromJson = "{\"map\":{\"Key [name=myName, nameSpace=myNameSpace]\":\"firstKey\"}}";
		ToContainer toContainer = new ToContainer(fromJson);
		Container container = toContainer.toContainer();
		assertNotNull(container);
		
		System.out.println("test: " + container.getMap());
		
		System.out.println("Hello World!");
	}

}
