package ua.kas.spring_test.robots_model;

import ua.kas.spring_test.creat_interface.Body;
import ua.kas.spring_test.creat_interface.Head;
import ua.kas.spring_test.creat_interface.Robot;

public class Robot_Vasya implements Robot {

	private Head head;
	private Body body;

	Robot_Vasya() {

	}

	Robot_Vasya(Head head, Body body) {
		this.body = body;
		this.head = head;
	}

	@Override
	public void fire() {
		System.out.println("I`thinking about boobs");
	}

	@Override
	public void go() {
		body.dance();
		head.think();
	}
}
