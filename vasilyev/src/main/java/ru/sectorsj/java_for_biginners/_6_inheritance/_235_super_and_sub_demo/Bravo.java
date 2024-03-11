package ru.sectorsj.java_for_biginners._6_inheritance._235_super_and_sub_demo;

public class Bravo extends Alpha{
	int code;
	
	@Override
	void show() {
		String txt = "Объект класса Bravo\n";
		txt += "Поле name: " + name + "\n";
		txt += "Поле code: " + code + "\n";
		
		for (int k = 0; k <= 20; k++) {
			txt += "-";
		}
		System.out.println(txt);
	}
}