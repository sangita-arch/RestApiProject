package jxparser;

import javax.xml.bind.JAXBException;

public class Test_Javato_Xml_Parser {

	public static void main(String[] args) throws JAXBException {
		
		Employee eobj = new Employee("Sangeta", "female", 30, 20);
		Java_To_Xml_Parser parser = new Java_To_Xml_Parser();
		parser.marshalling(eobj);
	

	}

}
