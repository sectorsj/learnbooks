package ru.sectorsj._3_classes_and_objects._107_using_private_members_demo;

class MyClass {
	private static int count = 0;
	
	private int number;
	private String name;
	
	public MyClass(String n) {
		count++;
		name = n;
		number = count;
		System.out.println("Создан объект с именем " + name);
	}
	
	public void show() {
		System.out.println("Название объекта: " + name);
		System.out.println("Номер объекта: " + number);
		System.out.println("Количество объектов: " + count);
	}
	
	public void set(String n) {
		name = n;
	}
}
