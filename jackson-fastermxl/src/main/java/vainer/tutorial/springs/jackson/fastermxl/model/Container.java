package vainer.tutorial.springs.jackson.fastermxl.model;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Container {

	@JsonProperty
	private Map<Key, String> map;

	public Container() {
	}

	public Map<Key, String> getMap() {
		return map;
	}

	public void setMap(Map<Key, String> map) {
		this.map = map;
	}

}
