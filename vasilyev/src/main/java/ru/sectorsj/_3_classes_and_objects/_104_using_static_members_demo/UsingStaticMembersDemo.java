package ru.sectorsj._3_classes_and_objects._104_using_static_members_demo;

public class UsingStaticMembersDemo {
	
	public static void main(String[] args) {
		MyClass.show();
		
		MyClass objA = new MyClass();
		MyClass objB = new MyClass();
		MyClass objC = new MyClass();
		
		MyClass.show();
		
		objC.show();
		objB.show();
	}
}
