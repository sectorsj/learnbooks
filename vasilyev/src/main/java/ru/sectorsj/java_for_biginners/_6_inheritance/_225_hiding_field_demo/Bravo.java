package ru.sectorsj.java_for_biginners._6_inheritance._225_hiding_field_demo;

public class Bravo extends Alpha{
	String name;
	
	void show() {
		System.out.println("Из класса Alpha: " + super.name);
		System.out.println("Из класса Bravo: " + name);
	}
	
	public Bravo(String a, String b) {
		super();
		super.name = a;
		name = b;
	}
}
