package ru.sectorsj.examples.ch01;// ������������� ����� Scanner:
import java.util.Scanner;
// �������� ������:
class ConsoleInputDemo{
   // ������� �����:
   public static void main(String[] args){
      // �������� ������� input ������ Scanner:
      Scanner input=new Scanner(System.in);
      // ���������� ��� ���������� ��������
      // ��� ������ � ������:
      String day,month;
      // ������������ ���������:
      System.out.print("����� ������� ����? ");
      // ����������� ��������� ������:
      day=input.nextLine();
      // ������������ ���������:
      System.out.print("����� �����? ");
      // ����������� ��������� ������:
      month=input.nextLine();
      // ��������� ����������:
      String text;
      // ��������� �������� ��� ����������� � �������:
      text="������� "+day+", ����� - "+month;
      // ������������ ���������:
      System.out.println(text);
   }
}