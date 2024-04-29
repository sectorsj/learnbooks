package ru.sectorsj._6_inheritance._227_virtual_method_demo;

public class Bravo extends Alpha{
	@Override
	void objectCreated() {
		System.out.println("Создан объект класса Bravo");
	}
	
	@Override
	void hello() {
		System.out.println("Объект класса Bravo");
	}
	
	public Bravo(String txt) {
		super(txt);
	}
}
