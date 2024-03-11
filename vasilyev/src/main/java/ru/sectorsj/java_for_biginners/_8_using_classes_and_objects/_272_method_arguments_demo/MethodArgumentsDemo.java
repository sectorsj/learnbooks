package ru.sectorsj.java_for_biginners._8_using_classes_and_objects._272_method_arguments_demo;

public class MethodArgumentsDemo {
	
	public static void main(String[] args) {
		int m = 100, n = 200;
		System.out.println("Переменные до вызова метода swap(): " + m + " и " + n);
		
		swap(m, n);
		
		System.out.println("Переменные после вызова метода swap(): " + m + " и " + n);
	}
	
	static void swap(int a, int b) {
		System.out.println("Выполняется метод swap()");
		System.out.println("Аргументы до изменения значений: " + a + " и " + b);
		
		int temp = b;
		b = a;
		a = temp;
		
		System.out.println("Аргументы после изменения значений: " + a + " и " + b);
		System.out.println("Завершено выполняется метода swap()");
	}
}
