package ru.sectorsj.java_for_biginners._7_abstract_classes_and_interfaces._257_using_default_method_demo;

public class UsingDefaultMethodDemo {
	public static void main(String[] args) {
		Base ref;
		
		Alpha objectAlpha = new Alpha();
		objectAlpha.hello();
		objectAlpha.show("объектная переменная objectAlpha");
		
		ref = objectAlpha;
		ref.show("Интерфейсная переменная ref");
		
		Bravo objectBravo = new Bravo();
		objectBravo.hello();
		objectBravo.show("объектная переменная objectBravo");
		
		ref = objectBravo;
		ref.show("интерфейсная переменная ref");
	}
}
