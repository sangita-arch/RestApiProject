package xjparser;

import javax.xml.bind.JAXBException;

public class Test_XML_To_Java_Parser {

	public static void main(String[] args) throws JAXBException {
		
		XML_To_Java_Parser  parser = new XML_To_Java_Parser();
		parser.unmarshalling("Employee1.xml");

	}

}
