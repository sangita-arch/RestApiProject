package jsontojava;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class JsonToJavaParser {

	public Person unmarshalling(String filename, Class<Person> pobj) throws JsonParseException, JsonMappingException, IOException {
		
		ObjectMapper mapper =new ObjectMapper();
		Person pdata = mapper.readValue(new File(filename),pobj);
		return pdata;
	}
	
	
}
