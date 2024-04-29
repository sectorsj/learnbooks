package ru.sectorsj._7_abstract_classes_and_interfaces._265_more_extending_interface_demo;

class MyClass implements Second{
	
	@Override
	public void bravo() {
		Second.super.bravo();
		System.out.println("Класс MyClass: метод bravo()");
	}
}
