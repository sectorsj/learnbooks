package ru.sectorsj._7_abstract_classes_and_interfaces._243_using_abstract_class_demo;

class Square extends ColoredFigure {
	public Square(String clr, int s) {
		super(clr, s);
	}
	
	String getName() {
		return "квадрат";
	}
	
	double getArea() {
		double k = 1;
		return size * size * k;
	}
}
