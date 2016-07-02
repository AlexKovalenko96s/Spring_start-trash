package ua.kas.spring_test.robots_model;

import ua.kas.spring_test.creat_interface.Body;
import ua.kas.spring_test.creat_interface.Head;
import ua.kas.spring_test.creat_interface.Robot;

public class Robot_Vasya implements Robot {

	private Head head;
	private Body body;
	private String color;
	private int year;
	private boolean sound;

	Robot_Vasya() {
	}

	public Robot_Vasya(String color, int year, boolean sound) {
		super();
		this.color = color;
		this.year = year;
		this.sound = sound;
	}

	Robot_Vasya(Head head, Body body) {
		this.body = body;
		this.head = head;
	}

	public void color_year_sound() {
		System.out.println(color + " " + year + " " + sound);
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

	public void initObject() {
		System.out.println("init");
	}

	public Head getHead() {
		return head;
	}

	public void setHead(Head head) {
		this.head = head;
	}

	public Body getBody() {
		return body;
	}

	public void setBody(Body body) {
		this.body = body;
	}
}
