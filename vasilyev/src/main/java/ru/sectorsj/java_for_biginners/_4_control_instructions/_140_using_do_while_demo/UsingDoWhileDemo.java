package ru.sectorsj.java_for_biginners._4_control_instructions._140_using_do_while_demo;

import javax.swing.*;

public class UsingDoWhileDemo {
	static String coder(int number) {
		String s = "";
		int n = number;
		do {
			s = (n % 2) + s;
			n/=2;
		} while (n != 0);
		return s;
	}
	
	public static void main(String[] args) {
		String input;
		String title = "Вычисление бинарного кода";
		input = JOptionPane.showInputDialog(
				null,
				"Введите целое число",
				title,
				JOptionPane.QUESTION_MESSAGE
		);
		
		if (input == null) {
			System.exit(0);
		}
		int num = Integer.parseInt(input);
		String code = coder(num);
		String text = "Вы ввели число: " + num;
		text += "\nБинарный код этого числа: " + code;
		JOptionPane.showMessageDialog(
				null,
				text,
				title,
				JOptionPane.INFORMATION_MESSAGE
		);
	}
}
