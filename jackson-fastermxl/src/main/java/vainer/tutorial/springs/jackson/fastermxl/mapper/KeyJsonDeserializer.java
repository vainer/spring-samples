package vainer.tutorial.springs.jackson.fastermxl.mapper;

import java.io.IOException;

import vainer.tutorial.springs.jackson.fastermxl.model.Key;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

public class KeyJsonDeserializer extends StdDeserializer<Key> {

	private static final long serialVersionUID = 5912830331045958444L;

	protected KeyJsonDeserializer(Class<?> vc) {
		super(vc);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Key deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
		Key key = new Key();
//		jp.nextToken();

		/*while (jp.nextToken() != JsonToken.END_OBJECT) {
			String currentName = jp.getCurrentName();
			System.out.println("currentName: " + currentName);

		}*/

		return key;
	}

	// @Override
	// public Key deserialize(JsonParser jp, DeserializationContext ctxt) throws
	// IOException, JsonProcessingException {
	// Key key = new Key();
	// jp.nextToken();
	//
	// while (jp.nextToken() != JsonToken.END_OBJECT) {
	// String currentName = jp.getCurrentName();
	// System.out.println("currentName: " + currentName);
	//
	// }
	//
	// return key;
	// }

}
