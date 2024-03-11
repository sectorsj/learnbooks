package ru.sectorsj.java_for_biginners._6_inheritance._233_using_to_string_demo;

class MyClass {
	String name;
	int code;
	
	MyClass(String txt, int num) {
		name = txt;
		code = num;
	}
	
	@Override
	public String toString() {
		String txt = "Объект класса MyClass\n";
		
		txt += "Поле name: " + name + "\n";
		txt += "Поле code: " + code + "\n";
		for (int k = 0; k < 21; k++) {
			txt += "-";
		}
		return txt;
	}
}
