package com.neww;



public class Greet {
	
	private String message;
	 public Greet()
	 {
		 System.out.println("Hello World");
	 }

	public String getMessage() {
		return message;
	}
	
	public Greet(String message) {
		this.message = message;
		
		
	}
	public void setMessage(String message) {
		this.message = message;
	}
	 

}
