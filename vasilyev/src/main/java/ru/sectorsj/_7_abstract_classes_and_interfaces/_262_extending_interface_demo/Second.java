package ru.sectorsj._7_abstract_classes_and_interfaces._262_extending_interface_demo;

interface Second extends First {
	
	void bravo();
	
	default void charlie() {
		System.out.println("Интерфейс Base: метод charlie()");
	}
	
	void echo();
}
