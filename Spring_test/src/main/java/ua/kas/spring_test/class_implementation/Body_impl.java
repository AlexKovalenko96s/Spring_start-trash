package ua.kas.spring_test.class_implementation;

import ua.kas.spring_test.creat_interface.Body;

public class Body_impl implements Body {

	@Override
	public void dance() {
		System.out.println("I`am body and i`am dancing");
	}
}
