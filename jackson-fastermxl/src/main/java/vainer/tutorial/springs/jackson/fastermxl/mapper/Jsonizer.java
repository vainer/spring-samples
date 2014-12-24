package vainer.tutorial.springs.jackson.fastermxl.mapper;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import vainer.tutorial.springs.jackson.fastermxl.model.Container;

public class Jsonizer {

	private Container container;

	public Jsonizer(Container container) {
		this.container = container;
	}
	

	public String toJson() {
		String result = null;
		try {
			ObjectMapper mapper = new ObjectMapper();
			result = mapper.writeValueAsString(container);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return result;		
	}

}
