package ru.sectorsj._7_abstract_classes_and_interfaces._243_using_abstract_class_demo;

public class Circle extends ColoredFigure{
	public Circle(String clr, int s) {
		super(clr, s);
	}
	
	String getName() {
		return "круг";
	}
	
	double getArea() {
		double k = Math.PI;
		return size * size * k;
	}
	
	String getSizeName() {
		return "радиус";
	}
}
