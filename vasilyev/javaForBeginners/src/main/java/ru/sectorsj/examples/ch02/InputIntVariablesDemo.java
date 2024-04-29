package ru.sectorsj.examples.ch02;

import javax.swing.*;
class InputIntVariablesDemo{
   public static void main(String[] args){
      // ������������� ����������:
      int age,year,birth;
      // ���������� ��� ������ �������� � ���� �����:
      String result;
      // ���������� �������� �� ���� �����:
      result=JOptionPane.showInputDialog("����� ������ ���?");
      // �������������� ������ � ����� �����:
      year=Integer.parseInt(result);
      // ���������� �������� �� ���� �����:
      result=JOptionPane.showInputDialog("������� ��� ���?");
      // �������������� ������ � ����� �����:
      age=Integer.parseInt(result);
      // ���������� ���� ��������:
      birth=year-age;
      // ����������� ���� � ����������:
      JOptionPane.showMessageDialog(null,"�� �������� � "+birth+" ����!");
   }
}