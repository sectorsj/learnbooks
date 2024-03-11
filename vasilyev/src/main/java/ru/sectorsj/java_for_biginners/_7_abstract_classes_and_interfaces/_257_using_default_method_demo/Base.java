package ru.sectorsj.java_for_biginners._7_abstract_classes_and_interfaces._257_using_default_method_demo;

public interface Base {
	default void show(String txt) {
		System.out.println("Интерфейс Base:" + " " + txt);
	}
	
	void hello();
}
