package ru.sectorsj.java_for_biginners._7_abstract_classes_and_interfaces._262_extending_interface_demo;

public interface First {
	default void alpha() {
		System.out.println("Интерфейс First: метод alpha()");
	}
	
	default void bravo() {
		System.out.println("Интерфейс First: метод bravo()");
	}
	
	default void charlie() {
		System.out.println("Интерфейс First: метод charlie()");
	}
	
	void delta();
}
