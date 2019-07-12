package at.mschuster.tools;

import java.io.BufferedReader;
import java.io.PrintWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.transform.stream.StreamSource;

/**
 * @author Freedom
 * @version 1.0.0.
 * @param <T> is the generic parameter for the type of class which I use dynamically and so which I convert to XML
 * @
 */
public class MarshallerForSocket<T> {

	/**
	 * Generic Object of class "T" which is used for a Object of a class to mashall and unmarshall it
	 */
	T object;

	/**
	 * To create object for reader
	 */
	public MarshallerForSocket() {
	}
	
	/**
	 * @param object is generic
	 */
	public MarshallerForSocket(T object) {
		this.object = object;
	}

	/**
	 * @param writer is a writer Object of PrintWriter
	 * @return the marshalled Object of Marshaller for sending it for example thought a socked
	 */
	public Marshaller marshaller(PrintWriter writer) {

		// Initialise variable
		Marshaller marshaller = null;

		try {
			// Gets list of classes which should get parsed
			// Entry point to use the framework, generates Context-Objekt 
			JAXBContext context = JAXBContext.newInstance(this.object.getClass());
			marshaller = context.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			marshaller.marshal(object, writer);

		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		return marshaller;
	}

	/**
	 * @param reader is reader Object of BufferedReader
	 * @return the unmarshalled Object of the type of the original Object
	 */
	@SuppressWarnings("unchecked")
	public T unmarshaller(BufferedReader reader) {

		// Initialise variable
		T object = null;

		try {
			// Gets list of classes which should get parsed
			// Entry point to use the framework, generates Context-Objekt 
			JAXBContext context = JAXBContext.newInstance(this.object.getClass());
			Unmarshaller unmarshaller = context.createUnmarshaller();

			XMLInputFactory inputFactory = XMLInputFactory.newInstance();
			XMLEventReader eventReader = inputFactory.createXMLEventReader(new StreamSource(reader));

			object = (T) unmarshaller.unmarshal(eventReader);

		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		return object;
	}
}