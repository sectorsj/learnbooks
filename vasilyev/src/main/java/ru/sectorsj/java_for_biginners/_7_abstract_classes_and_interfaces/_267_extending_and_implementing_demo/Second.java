package ru.sectorsj.java_for_biginners._7_abstract_classes_and_interfaces._267_extending_and_implementing_demo;

public interface Second {
	String getSecond();
	
	default void show() {
		System.out.println("Интерфейс Second: метод show()");
	}
	
}
