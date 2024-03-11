package ru.sectorsj.java_for_biginners._3_classes_and_objects._88_using_object_with_methods_demo;

class MyClass {
	int number;
	char symbol;
	
	void set(int n, char s) {
		number = n;
		symbol = s;
	}
	
	String getInfo() {
		String text = "Число: " + number + "\n";
		text += "Символ: " + symbol;
		return text;
	}
}
