package com.tnsif.SpringCore2;

import org.springframework.stereotype.Component;

@Component
public class student {
	
	private String name= "Pavi";
	
    public String getName() {
    	return name;
    }
    public void setName(String name) {
    	this.name = name;
    }
    public void showStudent() {
    	
    }
}
