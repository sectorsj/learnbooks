package ru.sectorsj.examples.ch02;

import javax.swing.*;
class UsingVariablesDemo{
   public static void main(String[] args){
      // ������������� ����������:
      int number=123;
      // �������������� ����������:
      double x=32.1;
      // ���������� ����������:
      char symb='A';
      // ���������� ����������:
      boolean state=true;
      // ��������� ���������� ��� ������������
      // ���������� ���������:
      String text="������������ ����������:\n";
      // ������������ �������� ������������� ����������:
      text=text+"����� �����: "+number+"\n";
      // ������������ �������� �������� ����������:
      text=text+"�������������� �����: "+x+"\n";
      // ������������ �������� ���������� ����������:
      text=text+"������: "+symb+"\n";
      // ������������ �������� ���������� ����������:
      text=text+"���������� ��������: "+state;
      // ����������� ���������:
      JOptionPane.showMessageDialog(null,text);
   }
}