package ru.sectorsj._4_control_instructions._125_using_multi_if_demo;

import javax.swing.*;

public class UsingMultiIfDemo {
	public static void main(String[] args) {
		ImageIcon img;
		String animal;
		String file = "resources/";
		String wolf = "Волк";
		String fox = "Лиса";
		String bear = "Медведь";
		String raccoon = "Енот";
		
		animal = JOptionPane.showInputDialog(
				null,
				wolf + ", " + fox + " или " + bear + " ?",
				"Укажите название животного",
				JOptionPane.QUESTION_MESSAGE
		);
		if (animal == null) {
			System.exit(0);
		} else if (animal.equalsIgnoreCase(wolf)) {
			file += "wolf.jpg";
			animal = wolf;
		} else if (animal.equalsIgnoreCase(fox)) {
			file += "fox.jpg";
			animal = fox;
		} else if (animal.equalsIgnoreCase(bear)) {
			file += "bear.jpg";
			animal = bear;
		} else {
			file += "raccoon.jpg";
			animal = raccoon;
		}
		
		img = new ImageIcon(file);
		JOptionPane.showMessageDialog(
				null,
				img,
				animal,
				JOptionPane.PLAIN_MESSAGE
		);
	}
}
