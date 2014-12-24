package vainer.tutorial.springs.jackson.fastermxl.mapper;

import static org.junit.Assert.assertNotNull;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import vainer.tutorial.springs.jackson.fastermxl.model.Container;
import vainer.tutorial.springs.jackson.fastermxl.model.Key;

public class JsonizerTest {
	
	@Test
	public void serializableArray() {
		Serializable sr = new Serializable[2];
		assertNotNull(sr);
	}
	
	@Test
	public void toJson() {
		Map<Key, String> map = new HashMap<>();
		map.put(new Key("myName", "myNameSpace"), "firstKey");
		Container container = new Container();
		container.setMap(map);
		
		Jsonizer jsonizer = new Jsonizer(container);
		String json = jsonizer.toJson();
		
		System.out.println(json);
	}

}
