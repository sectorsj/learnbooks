package ru.sectorsj._7_abstract_classes_and_interfaces._254_using_interface_vars_demo;

public class UsingInterfaceVarsDemo {
	public static void main(String[] args) {
		Base ref;
		
		ref = new Alpha("Alpha","текст");
		ref.show();
		
		ref = new Bravo("Bravo",1234);
		ref.show();
	}
}
