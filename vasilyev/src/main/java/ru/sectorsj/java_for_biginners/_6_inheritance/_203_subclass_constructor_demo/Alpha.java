package ru.sectorsj.java_for_biginners._6_inheritance._203_subclass_constructor_demo;

public class Alpha {
	
	String name;
	int code;
	
	Alpha(String name, int code) {
		this.name = name;
		this.code = code;
		System.out.println("Класс Alpha");
		System.out.println("Поле name - " + this.name);
		System.out.println("Поле code - " + this.code);
	}
	Alpha (String name) {
		this(name, 0);
	}
	
	Alpha(int code) {
		this("Белый", code);
	}
	
	Alpha() {
		this("Желтый", 1);
	}
}
