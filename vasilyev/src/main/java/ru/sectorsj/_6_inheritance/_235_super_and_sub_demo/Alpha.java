package ru.sectorsj._6_inheritance._235_super_and_sub_demo;

public class Alpha {
	String name;
	
	void show() {
		String txt = "Объект класса Alpha\n";
		txt += "Поле name: " + name + "\n";
		for (int k = 0; k <= 20; k++) {
			txt += "-";
		}
		System.out.println(txt);
	}
}
