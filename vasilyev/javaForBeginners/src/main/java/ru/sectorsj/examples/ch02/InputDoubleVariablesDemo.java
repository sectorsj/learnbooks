package ru.sectorsj.examples.ch02;

import javax.swing.*;
class InputDoubleVariablesDemo{
   public static void main(String[] args){
      // �������� ����������:
      double mass,height,bmi;
      // ���������� ��� ������ �������� � ���� �����:
      String result;
      // ���������� �������� �� ���� �����:
      result=JOptionPane.showInputDialog("��� ���� � ������:");
      // �������������� ������ � �����:
      height=Double.parseDouble(result);
      // ���������� �������� �� ���� �����:
      result=JOptionPane.showInputDialog("��� ��� � �����������:");
      // �������������� ������ � �����:
      mass=Double.parseDouble(result);
      // ���������� ������� ����� ����:
      bmi=mass/height/height;
      // ���������� ����������� ��������:
      bmi=Math.round(bmi*100)/100.0;
      // ����������� ���� � ����������:
      JOptionPane.showMessageDialog(null,"������ ����� ����: "+bmi);
   }
}