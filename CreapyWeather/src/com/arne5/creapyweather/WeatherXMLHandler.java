package com.arne5.creapyweather;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;



public class WeatherXMLHandler extends DefaultHandler{

	private XMLDataCollected info = new XMLDataCollected();
	
	public String conditionInfo(){
		return info.conditionToString();
	}
	
	public String getInformation(){
		return info.dataToString();
	}
	
	@Override
	public void startElement(String uri, String localName, String qName,
			Attributes attributes) throws SAXException {
		
		
		// TODO Auto-generated method stub
		//old way try a case statement
		if (localName.equals("city")){
			String city = attributes.getValue("data");
			info.setCity(city);
		}else if  (localName.equals("temp_f")){
			String t = attributes.getValue("data");
			int temp = Integer.parseInt(t);
			info.setTemp(temp);
		}
		else if (localName.equals("condition")){
			String condition = attributes.getValue("data");
			info.setCondition(condition);
			
	}
				
		
	}	
	
}