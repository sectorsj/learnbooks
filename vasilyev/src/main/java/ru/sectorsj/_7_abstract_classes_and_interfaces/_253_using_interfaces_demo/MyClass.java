package ru.sectorsj._7_abstract_classes_and_interfaces._253_using_interfaces_demo;

class MyClass implements First,Second {
	@Override
	public void hello() {
		System.out.println("метод и интерфейса Fist");
	}
	
	@Override
	public void hi() {
		System.out.println("метод и интерфейса Base");
	}
}
