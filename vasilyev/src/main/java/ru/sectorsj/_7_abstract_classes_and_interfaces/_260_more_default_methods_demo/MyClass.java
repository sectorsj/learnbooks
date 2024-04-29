package ru.sectorsj._7_abstract_classes_and_interfaces._260_more_default_methods_demo;

class MyClass implements First, Second{
	@Override
	public void hello() {
		First.super.hello();
		Second.super.hello();
	}
}
