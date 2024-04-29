package ru.sectorsj._6_inheritance._221_override_method_demo;

public class Bravo extends Alpha{
	int code;
	
	void show() {
		System.out.println("Объект класса Bravo");
		System.out.println("Поле name - " + name);
		System.out.println("Поле code - " + code);
	}
	
	public Bravo(String name, int code) {
		super(name);
		this.code = code;
	}
	
	
}
