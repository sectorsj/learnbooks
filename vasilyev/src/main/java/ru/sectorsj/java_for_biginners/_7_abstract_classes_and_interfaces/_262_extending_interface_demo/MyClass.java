package ru.sectorsj.java_for_biginners._7_abstract_classes_and_interfaces._262_extending_interface_demo;

class MyClass implements Second {
	@Override
	public void bravo() {
		System.out.println("Класс MyClass: метод bravo()");
	}
	
	@Override
	public void delta() {
		System.out.println("Класс MyClass: метод delta()");
	}
	
	@Override
	public void echo() {
		System.out.println("Класс MyClass: метод echo()");
	}
}
