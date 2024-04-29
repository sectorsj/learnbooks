package ru.sectorsj._4_control_instructions._151_using_switch_demo;

public class UsingSwitchDemo {
	static String getDay(int num) {
		String day;
		switch (num) {
			case 1:
				day = "понедельник";
				break;
			case 2:
				day = "вторник";
				break;
			case 3:
				day = "среда";
				break;
			case 4:
				day = "четверг";
				break;
			case 5:
				day = "пятница";
				break;
			case 6:
				day = "суббота";
				break;
			case 7:
				day = "воскресенье";
				break;
			default:
				day = "неизвестно";
		}
		return day;
	}
	static String testDay(int num) {
		String day;
		switch (num) {
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				day = "будний день";
				break;
			case 6:
			case 7:
				day = "выходной день";
				break;
			default:
				day = "неизвестно";
		}
		return day;
	}
	
	public static void main(String[] args) {
		for (int k = 0; k <= 8; k++) {
			System.out.println(k + ": " + getDay(k) + "\t- " + testDay(k));
		}
	}
}
