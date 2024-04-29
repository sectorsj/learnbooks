package ru.sectorsj._6_inheritance._224_more_overriding_demo;

public class MoreOverridingDemo {
	public static void main(String[] args) {
		Alpha objectAlpha = new Alpha("object alpha");
		Bravo objectBravo = new Bravo("object bravo", 123);
		
		objectAlpha.show();
		objectBravo.show();
	}
}
