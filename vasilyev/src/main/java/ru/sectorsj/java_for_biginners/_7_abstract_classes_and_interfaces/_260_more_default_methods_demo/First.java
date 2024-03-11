package ru.sectorsj.java_for_biginners._7_abstract_classes_and_interfaces._260_more_default_methods_demo;

public interface First {
	default void hello() {
		System.out.println("Метод из интерфейса First");
	}
}
