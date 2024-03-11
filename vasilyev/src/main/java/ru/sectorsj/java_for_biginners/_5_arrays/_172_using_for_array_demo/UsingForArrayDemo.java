package ru.sectorsj.java_for_biginners._5_arrays._172_using_for_array_demo;

import javax.swing.*;
import java.util.Random;

public class UsingForArrayDemo {
	public static void main(String[] args) {
		int size = 10;
		Random rnd = new Random();
		int[] nums = new int[size];
		String txt = "Массив случайных чисел:\n| ";
		
		for (int k = 0; k < nums.length; k++) {
			nums[k] = rnd.nextInt(10) + 1;
			txt += nums[k] + " | ";
		}
		txt += "\nПроверка:\n| ";
		for (int s : nums) {
			txt += s + " | ";
		}
		JOptionPane.showMessageDialog(
				null,
				txt,
				"Случайные числа",
				JOptionPane.PLAIN_MESSAGE
		);
	}
}
