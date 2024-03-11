package ru.sectorsj.java_for_biginners._3_classes_and_objects._93_method_overloading_demo;

public class MethodOverloadingDemo {
	public static void main(String[] args) {
		MyClass objA, objB;
		
		objA = new MyClass();
		objB = new MyClass();
		
		objA.set(100);
		objA.set('A');
		
		System.out.println("Объект objA:");
		objA.show();
		
		objB.set();
		objB.show("Объект objB");
		objB.set(200, 'B');
		
		System.out.println("Объект objB после изменения:");
		objB.show("Число", "Символ");
	}
}
