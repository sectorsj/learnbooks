package ru.sectorsj._7_abstract_classes_and_interfaces._251_using_interface_demo;

class MyClass implements MyInterface{
	@Override
	public int getNUMBER(double num) {
		return (int) num;
	}
	
	@Override
	public char getSymbol(int symb) {
		return (char) ('A'+symb);
	}
}
