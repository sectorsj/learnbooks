package ru.sectorsj._6_inheritance._224_more_overriding_demo;

public class Bravo extends Alpha {
	int code;
	
	@Override
	void show() {
		super.show();
		System.out.println("Числовое поле " + code);
	}
	
	public Bravo(String name, int code) {
		super(name);
		this.code = code;
	}
}
