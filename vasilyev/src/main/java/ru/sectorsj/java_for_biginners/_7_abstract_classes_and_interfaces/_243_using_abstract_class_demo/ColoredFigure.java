package ru.sectorsj.java_for_biginners._7_abstract_classes_and_interfaces._243_using_abstract_class_demo;

abstract class ColoredFigure {
	String color;
	int size;
	
	public ColoredFigure(String clr, int s) {
		color = clr;
		size = s;
	}
	
	void show() {
		System.out.println("Фигура: " + color + " " + getName());
		System.out.println("Характерный размер (" + getSizeName()+"):" + size);
		System.out.printf("Площадь: %.3f\n", getArea());
		
		String line = "";
		for (int k = 0; k <= 30; k++) {
			line += "*";
		}
		System.out.println(line);
	}
	
	String getSizeName() {
		return "сторона";
	}
	
	abstract String getName();
	abstract double getArea();
}
