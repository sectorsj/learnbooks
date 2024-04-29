package ru.sectorsj._3_classes_and_objects._104_using_static_members_demo;

class MyClass {
	static int count = 0;
	
	MyClass() {
		count++;
		System.out.println("Создан объект номер " + count);
	}
	
	static void show() {
		System.out.println("Количество объектов: " + count);
	}
}
