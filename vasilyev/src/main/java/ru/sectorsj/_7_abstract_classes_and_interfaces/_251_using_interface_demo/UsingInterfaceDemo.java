package ru.sectorsj._7_abstract_classes_and_interfaces._251_using_interface_demo;

public class UsingInterfaceDemo {
	public static void main(String[] args) {
		MyClass object = new MyClass();
		
		System.out.println("Статическая константа: " + MyClass.NUMBER);
		System.out.println("Целое число: " + object.getNUMBER(12.45));
		System.out.println("Символ: " + object.getSymbol(4));
	}
}
