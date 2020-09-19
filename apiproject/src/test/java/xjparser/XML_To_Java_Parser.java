package xjparser;



import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

import javax.xml.bind.Unmarshaller;

import jxparser.Employee;

public class XML_To_Java_Parser {
	
public void unmarshalling(String filename) throws JAXBException {
	

		File f =new File(filename);
		JAXBContext jaxb = JAXBContext.newInstance(Employee.class);
		Unmarshaller um = jaxb.createUnmarshaller();
		Employee eobj =(Employee)um.unmarshal(f);
		System.out.println(eobj);
	

}

}
