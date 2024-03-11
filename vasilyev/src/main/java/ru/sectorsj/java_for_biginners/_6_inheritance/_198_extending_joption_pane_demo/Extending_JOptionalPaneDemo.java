package ru.sectorsj.java_for_biginners._6_inheritance._198_extending_joption_pane_demo;

public class Extending_JOptionalPaneDemo {
	
	public static void main(String[] args) {
		MyPane.showMessage("Всем привет!");
		int number;
		number = MyPane.getInteger("Введите целое число");
		String txt = "Числа от 1 до " + number + ":\n";
		
		for (int k = 0; k <= number; k++) {
			txt += k + " ";
		}
		
		MyPane.showMessage(txt, "Целые числа");
	}
}
