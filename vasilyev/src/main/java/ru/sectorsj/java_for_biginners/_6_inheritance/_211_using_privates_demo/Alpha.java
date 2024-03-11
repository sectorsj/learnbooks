package ru.sectorsj.java_for_biginners._6_inheritance._211_using_privates_demo;

public class Alpha {
	 private int code;
	 
	 public void set(int code) {
	 	this.code = code;
	 }
	 public void show() {
		 System.out.println("Поле code: " + code);
	 }
	
	Alpha(int code) {
		set(code);
	}
}


