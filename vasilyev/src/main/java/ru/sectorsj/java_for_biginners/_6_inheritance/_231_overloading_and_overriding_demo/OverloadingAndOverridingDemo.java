package ru.sectorsj.java_for_biginners._6_inheritance._231_overloading_and_overriding_demo;

public class OverloadingAndOverridingDemo {
	public static void main(String[] args) {
		Alpha objectAlpha = new Alpha();
		objectAlpha.show();
		objectAlpha.show("Объект Alpha");
		
		Bravo objectBravo = new Bravo();
		objectBravo.show();
		objectBravo.show("Объект Bravo");
		objectBravo.show(123);
	}
}
