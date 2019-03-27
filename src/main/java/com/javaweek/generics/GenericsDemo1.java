/*
 * Type object was too generic and it allows both java.sql as well as java.util.date
 *

* Need for explicit casting as the object needs to be downcasted.
* Unpleasant exception at runtime.
* Since java is a type safe language that means type safety check is done at 
* runtime by java.

* So to avoid and minimize these runtime exception, language designers decided 
* to create generics.
Purpose was to detect such issues at compile time and minimize errors at runtime

Generics is purely a compile time concept . "It means type safety at compile time" */

package com.javaweek.generics;

import java.sql.Date;

public class GenericsDemo1 {

	public static void main(String[] args) {

		Person p = new Person();
		p.setInfo(new java.util.Date(1235466));
		
		
		GenericsDemo2 gd = new GenericsDemo2();
		gd.john(p);
		
		Date date =  (Date) p.getInfo();
			
		System.out.println(date);
		
		
//		AnotherPerson<Date> ap = new AnotherPerson<Date>();
//		
//		ap.setInfo(new java.util.Date(1235466));
//		
//		
//		GenericsDemo2 gd = new GenericsDemo2();
//		gd.john(ap);
//		
//		Date date =  ap.getInfo();
//		
//		System.out.println(date);
//		
		
	}
}

class Person {
private Object info;

public Object getInfo() {
	return info;
}

public void setInfo(Object i) {
	 this.info = i;
}


}

class AnotherPerson<T> {
	private T info;

	public T getInfo() {
		return info;
	}

	public void setInfo(T info) {
		this.info = info;
	}
	
	
	
}