package com.javaweek.reflections;

public class SimpleDemo {
	public static void main (String[] args) throws ClassNotFoundException {
	
		//1 - By using Class.forname() method 
		Class c1 = Class.forName("Test"); 
		
		//2- By using getClass() method 
		SimpleDemo obj = new SimpleDemo();
		Class c2 = obj.getClass();
		
		//3- By using .class 
		Class c3= SimpleDemo.class;
		}
	}