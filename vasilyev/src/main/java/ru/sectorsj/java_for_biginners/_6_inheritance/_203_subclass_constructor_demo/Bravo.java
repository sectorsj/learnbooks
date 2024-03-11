package ru.sectorsj.java_for_biginners._6_inheritance._203_subclass_constructor_demo;

public class Bravo extends Alpha {
	char symbol;
	
	private void show() {
		System.out.println("Класс Bravo:");
		System.out.println("Поле symbol - " + this.symbol);
		
		for (int k = 1; k <= 18; k++) {
			System.out.print("-");
		}
		System.out.println("");
	}
	
	Bravo(String name, int code, char symbol) {
		super(name, code);
		this.symbol = symbol;
		show();
	}
	
	Bravo(char symbol) {
		super();
		this.symbol = symbol;
		show();
	}
	
	Bravo(String name) {
		super(name);
		this.symbol = 'A';
		show();
	}
	
	Bravo(int code) {
		super(code);
		this.symbol = 'B';
		show();
	}
	
	Bravo() {
		this.symbol = 'C';
		show();
	}
	
	Bravo (String name, int code) {
		this(name, code, 'D');
	}
}
