package ru.sectorsj._7_abstract_classes_and_interfaces._260_more_default_methods_demo;

public interface Second {
	default void hello() {
		System.out.println("Метод из интерфейса Base");
	}
}
