package ua.kas.spring_test.class_implementation;

import ua.kas.spring_test.creat_interface.Head;

public class Head_impl implements Head {

	@Override
	public void think() {
		System.out.println("I`am head and I`an thinking");
	}
}
