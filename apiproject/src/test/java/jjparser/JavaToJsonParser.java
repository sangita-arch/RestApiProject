package jjparser;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class JavaToJsonParser {
	
	public void marshalling(Person pobj) throws JsonGenerationException, JsonMappingException, IOException {
		
		ObjectMapper mapper =new ObjectMapper();
		mapper.writeValue(new File("Person.json"), pobj);
		
	}
	
	

}
