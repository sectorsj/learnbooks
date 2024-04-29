package ru.sectorsj._7_abstract_classes_and_interfaces._265_more_extending_interface_demo;

interface Second extends First {
	@Override
	default void alpha() {
		First.super.alpha();
		System.out.println("Интерфейс Base: метод alpha()");
	}
	default void bravo() {
		System.out.println("Интерфейс Base: метод bravo()");
	}
}
