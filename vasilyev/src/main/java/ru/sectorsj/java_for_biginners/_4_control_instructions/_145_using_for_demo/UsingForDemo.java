package ru.sectorsj.java_for_biginners._4_control_instructions._145_using_for_demo;

public class UsingForDemo {
	public static void main(String[] args) {
		
		int s = 0, k, n = 10;
		
		for (k = 1; k <= n; k++) {
			s+=k*k;
		}
		String txt = "Сумма квадратов чисел от 1 до " + n + ": " + s;
		System.out.println(txt);
		}
	}
