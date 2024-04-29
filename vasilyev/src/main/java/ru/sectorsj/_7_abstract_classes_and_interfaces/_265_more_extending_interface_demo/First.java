package ru.sectorsj._7_abstract_classes_and_interfaces._265_more_extending_interface_demo;

interface First {
	default void alpha() {
		System.out.println("Интерфейс First: метод alpha()");
	}
}
