package ru.sectorsj.examples.ch02;// �������������� ������ Scanner:
import java.util.Scanner;
class InputVariablesConsoleDemo{
   public static void main(String[] args){
      // �������� ������� input ������ Scanner:
      Scanner input=new Scanner(System.in);
      // ������� ���:
      int now=2015;
      // ���������� ��� ������ ����� ������������:
      String name;
      // ���������� ��� ������ ��������:
      int age;
      // ���������� ��� ������ �������� ����� (� ������):
      double height;
      // ���������� ��� ������ �������� �����
      // (� �����������):
      double mass;
      System.out.print("���� ���: ");
      // ���������� ����� (�����):
      name=input.nextLine();
      System.out.print("��� �������: ");
      // ���������� �������� (����� �����):
      age=input.nextInt();
      System.out.print("��� ���� (� ������): ");
      // ���������� ����� � ������
      // (����� � ������� � ��������� ������):
      height=input.nextDouble();
      System.out.print("����� ���� (� �����������): ");
      // ���������� ����� � �����������
      // (����� � ������� � ��������� ������):
      mass=input.nextDouble();
      // ���������� ������� ����� ����:
      double bmi=mass/height/height;
      // ����������� �����:
      System.out.println("������������, "+name+"!");
      // ���������� � ����������� ���� ��������:
      System.out.println("�� �������� � "+(now-age)+" ����.");
      // ����������� �������� ������� ����� ����:
      System.out.printf("��� ������ ����� ����: %5.2f\n",bmi);
   }
}