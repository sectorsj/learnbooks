package ru.sectorsj.java_for_biginners._7_abstract_classes_and_interfaces._257_using_default_method_demo;

public class Alpha implements Base{
	@Override
	public void hello() {
		System.out.println("Объект класса Alpha");
	}
	
	@Override
	public void show(String txt) {
		System.out.println("Класс Alpha:" + " " + txt);
	}
}
