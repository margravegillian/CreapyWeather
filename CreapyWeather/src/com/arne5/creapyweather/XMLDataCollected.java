package com.arne5.creapyweather;

public class XMLDataCollected {
	private int temp = 0;
	private String city = null;
	private String condition = null;

	public void setCity(String c){
		city = c;
	}
	
	public void setTemp(int t){
		temp = t;
	}
	public void setCondition(String con){
		condition = con;
	}
	
	public String dataToString(){
		return "In " + city + " the Current Temp in F is " + temp + " degrees, It is currently "+ condition;
	}	
}
