package ru.sectorsj.java_for_biginners._6_inheritance._231_overloading_and_overriding_demo;

public class Bravo extends Alpha {
	@Override
	void show() {
		System.out.println("Класс Bravo");
	}
	
	void show(int num) {
		System.out.println("Число " + num);
	}
}
