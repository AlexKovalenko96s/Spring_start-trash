package ua.kas.spring_test.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ua.kas.spring_test.robots_model.Robot_Vasya;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("Application.xml");
		Robot_Vasya robot_vasya = (Robot_Vasya) context.getBean("Robot_Vasya1");
		// robot_vasya.fire();
		robot_vasya.color_year_sound();
		// robot_vasya = (Robot_Vasya) context.getBean("Robot_Vasya");
		// robot_vasya.go();
	}
}