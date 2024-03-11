package ru.sectorsj.java_for_biginners._6_inheritance._235_super_and_sub_demo;

public class SuperAndSubDemo {
	public static void main(String[] args) {
		Alpha objectAlpha = new Alpha();
		objectAlpha.name = "alpha";
		objectAlpha.show();
		
		Bravo objectBravo = new Bravo();
		objectBravo.name = "bravo";
		objectBravo.code = 1101001;
		objectBravo.show();
		
		objectAlpha = objectBravo;
		objectAlpha.name = "charlie";
		objectAlpha.show();
		objectBravo.show();
	}
}