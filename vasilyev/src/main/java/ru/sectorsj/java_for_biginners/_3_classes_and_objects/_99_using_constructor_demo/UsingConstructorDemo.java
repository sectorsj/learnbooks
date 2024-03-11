package ru.sectorsj.java_for_biginners._3_classes_and_objects._99_using_constructor_demo;

public class UsingConstructorDemo {
	public static void main(String[] args) {
		MyClass objA = new MyClass();
		MyClass objB = new MyClass(200, 'B');
		System.out.println("Объект objA:");
		objA.show();
		System.out.println("Объект objB:");
		objB.show();
	}
}
