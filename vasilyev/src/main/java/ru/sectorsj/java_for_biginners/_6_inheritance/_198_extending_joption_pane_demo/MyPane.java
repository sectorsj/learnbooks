package ru.sectorsj.java_for_biginners._6_inheritance._198_extending_joption_pane_demo;

import javax.swing.*;

class MyPane extends JOptionPane {
	static void showMessage(String txt, String title) {
		showMessageDialog(
				null,
				txt,
				title,
				PLAIN_MESSAGE,
				new ImageIcon("resources/giraffe.png")
				);
	}
	
	static void showMessage(String txt) {
		showMessage(txt, "Сообщение");
	}
	
	static int getInteger(String txt) {
		String res;
		res = showInputDialog(
				null,
				txt,
				"Число (по умолчанию 10)",
				QUESTION_MESSAGE);
		if (res == null) {
			return 10;
		} else {
			return Integer.parseInt(res);
		}
	}
}
