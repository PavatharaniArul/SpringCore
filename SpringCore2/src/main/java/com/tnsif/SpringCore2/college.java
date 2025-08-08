package com.tnsif.SpringCore2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class college {
	private student stud;
	@Autowired
	public college (student stud) {
		this.stud=stud;
	}
	public void showcollegeDetails() {
		System.out.println("Welcome to College");
		stud.showStudent();
	}

}
