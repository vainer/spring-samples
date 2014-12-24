package vainer.tutorial.springs.jackson.fastermxl.mapper;

import java.io.IOException;

import vainer.tutorial.springs.jackson.fastermxl.model.Key;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.KeyDeserializer;

public class KeyKeyDeserializer extends KeyDeserializer {

	@Override
	public Object deserializeKey(String string, DeserializationContext dc) throws IOException, JsonProcessingException {
		Key newKey = new Key();
		System.out.println("string: " + string);

		JsonParser jp = dc.getParser();
		JsonToken currentToken = jp.getCurrentToken();

		String text = jp.getText();
		System.out.println("text: " + text);
		System.out.println("currentToken: " + currentToken);
		System.out.println("jp.getCurrentName(): " + jp.getCurrentName());
		return newKey;
	}

}
