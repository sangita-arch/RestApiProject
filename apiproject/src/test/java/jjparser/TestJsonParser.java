package jjparser;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;

public class TestJsonParser {

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		
		Person p =new Person("Sangeeta","female",20,30);
		JavaToJsonParser parser =new JavaToJsonParser();
		parser.marshalling(p);
		System.out.println("pass");

	}

}
