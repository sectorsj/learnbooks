package ru.sectorsj.java_for_biginners._7_abstract_classes_and_interfaces._243_using_abstract_class_demo;

public class UsingAbstractClassDemo {
	public static void main(String[] args) {
		Triangle triangle = new Triangle("красный", 2);
		Square square = new Square("черный", 3);
		Circle circle = new Circle("желтый", 1);
		
		System.out.println("Использование объектных переменных подклассов");
		triangle.show();
		square.show();
		circle.show();
		
		ColoredFigure figure;
		
		System.out.println("Использование объектной переменной абстрактного суперкласса");
		
		figure = triangle;
		figure.show();
		
		figure = square;
		figure.show();
		
		figure = circle;
		figure.show();
	}
}
