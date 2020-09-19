package jsontojava;

import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;

public class TestJavaParser {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		
		JsonToJavaParser parser =new JsonToJavaParser();
		Person pobj= parser.unmarshalling("Person1.json",Person.class);
		System.out.println(pobj);
		

	}

}
