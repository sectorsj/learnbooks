package ru.sectorsj._7_abstract_classes_and_interfaces._243_using_abstract_class_demo;

class Triangle extends ColoredFigure{
	public Triangle(String clr, int s) {
		super(clr, s);
	}
	
	String getName() {
		return "треугольник";
	}
	
	double getArea() {
		double k = Math.sqrt(3)/4;
		return size * size * k;
	}
}
