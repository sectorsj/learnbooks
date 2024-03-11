package ru.sectorsj.java_for_biginners._6_inheritance._227_virtual_method_demo;

public class Alpha {
	String name;
	
	void objectCreated() {
		System.out.println("Создан объект класса Alpha");
	}
	
	void hello() {
		System.out.println("Объект класса Alpha");
	}
	
	void show() {
		hello();
		System.out.println("Поле name: " + name);
	}
	
	public Alpha(String txt) {
		objectCreated();
		name = txt;
	}
}
