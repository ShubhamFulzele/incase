package com.sreenutech.orders;

import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.sreenutech.ordersreq.OrderReqtype;

public class JAXBMarshaller {

	public static void main(String[] args) throws JAXBException, JsonGenerationException, JsonMappingException, IOException {
		
		JAXBContext ctxt = JAXBContext.newInstance(OrderReqtype.class);
		
		 Marshaller marsh = ctxt.createMarshaller();
		 
		 OrderReqtype req = new OrderReqtype();
		 req.setOid("12121");
		 req.setName("mobile");
		 
		 marsh.marshal(req, System.out);
		 
		 ObjectMapper mapper = new ObjectMapper();
		 String json = mapper.defaultPrettyPrintingWriter().writeValueAsString(req);
		 System.out.println("json is :"+json);

	}

}
