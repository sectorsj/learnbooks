package ru.sectorsj._7_abstract_classes_and_interfaces._254_using_interface_vars_demo;

public class Bravo implements Base {
	String name;
	int number;
	
	public Bravo(String str, int num) {
		name = str;
		number = num;
	}
	
	@Override
	public void show() {
		System.out.println("Объект класса" + " " + name);
		System.out.println("Целочисленное поле:" + " " + number);
	}
}
