package ru.sectorsj.java_for_biginners._4_control_instructions._134_using_while_demo;

import javax.swing.*;

public class UsingWhileDemo {
	
	static int decoder(String code) {
		int n = code.length();
		int s = 0, k = 1, q = 1, a;
		
		while (k <= n) {
			if (code.charAt(n-k)=='1') {
				a = 1;
			} else {
				a = 0;
			}
			
			s += q * a;
			q *= 2;
			k++;
		}
		return s;
	}
	
	public static void main(String[] args) {
		String input;
		String title = "Расшифровка бинарного кода";
		
		input = JOptionPane.showInputDialog(
				null,
				"Введите бинарный код",
				title,
				JOptionPane.QUESTION_MESSAGE
		);
		if (input == null) {
			System.exit(0);
		}
		int num = decoder(input);
		String text = "Вы ввели бинарный код: " + input;
		text += "\nКод соответствует числу: " + num;
		JOptionPane.showMessageDialog(
				null,
				text,
				title,
				JOptionPane.INFORMATION_MESSAGE
		);
	}
}
