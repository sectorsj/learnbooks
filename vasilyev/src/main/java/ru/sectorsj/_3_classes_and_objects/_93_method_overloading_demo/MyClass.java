package ru.sectorsj._3_classes_and_objects._93_method_overloading_demo;

class MyClass {
	int number;
	char symbol;
	
	void set(int n) {
		number = n;
	}
	
	void set(char s) {
		symbol = s;
	}
	
	void set( int n, char s) {
		set(n);
		set(s);
	}
	
	void set() {
		set(0,'Z');
	}
	
	void show() {
		System.out.println("Значения полей " + number + " и " + symbol);
	}
	
	void show(String txt) {
		System.out.println(txt + ": значения полей " + number + " и " + symbol);
	}
	
	void show(String txt1, String txt2) {
		System.out.println(txt1 + ": " + number);
		System.out.println(txt2 + ": " + symbol);
	}
	
	
}
