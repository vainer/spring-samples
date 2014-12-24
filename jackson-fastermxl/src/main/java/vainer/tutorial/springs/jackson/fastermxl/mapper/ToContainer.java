package vainer.tutorial.springs.jackson.fastermxl.mapper;

import java.io.IOException;

import vainer.tutorial.springs.jackson.fastermxl.model.Container;
import vainer.tutorial.springs.jackson.fastermxl.model.Key;

import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;

public class ToContainer {

	private String fromJson;

	public ToContainer(String fromJson) {
		this.fromJson = fromJson;
	}
	
	
	public Container toContainer() {
		Container container = null;
		try {
			ObjectMapper objectMapper = new ObjectMapper();
			SimpleModule module = new SimpleModule("EnhancedDatesModule", new Version(0, 1, 0, "alpha", null, null));
			module.addKeyDeserializer(Key.class, new KeyKeyDeserializer());
//			module.addDeserializer(Key.class, new KeyJsonDeserializer(Key.class));
			objectMapper.registerModule(module);
			
			container = objectMapper.readValue(fromJson, Container.class);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return container;
	}

}
