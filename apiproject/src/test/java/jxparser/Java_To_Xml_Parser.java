package jxparser;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class Java_To_Xml_Parser {

	public void marshalling(Employee eobj) throws JAXBException {
		
		JAXBContext jaxb = JAXBContext.newInstance(Employee.class);
		Marshaller m = jaxb.createMarshaller();
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
		m.marshal(eobj, System.out);
		m.marshal(eobj, new File("Employee.xml"));
	}
	
}
