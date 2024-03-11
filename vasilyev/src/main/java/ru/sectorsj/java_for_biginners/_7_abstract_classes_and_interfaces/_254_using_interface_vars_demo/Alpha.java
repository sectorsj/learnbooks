package ru.sectorsj.java_for_biginners._7_abstract_classes_and_interfaces._254_using_interface_vars_demo;

public class Alpha implements Base{
	String name;
	String word;
	
	public Alpha(String str, String txt) {
		name = str;
		word = txt;
	}
	
	@Override
	public void show() {
		System.out.println("Объект класса"+ " " + name);
		System.out.println("Текстовое поле:"+ " " + word);
	}
}
