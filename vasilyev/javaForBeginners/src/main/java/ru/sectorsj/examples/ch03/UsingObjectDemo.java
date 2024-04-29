package ru.sectorsj.examples.ch03;

import javax.swing.*;
// �������� ������:
class MyClass3 {
   // ���� ������:
   int number;
   char symbol;
}
// �������� ������ � ������� ������� ���������:
class UsingObjectDemo{
   // ������� ����� ���������:
   public static void main(String[] args){
      // �������� �������:
      MyClass3 obj=new MyClass3();
      // ������������ �������� ����� �������:
      obj.number = 100;
      obj.symbol = 'A';
      // ����� ��� ����������� � ���������� ����:
      String text = "�����:  "+obj.number+"\n";
      text+="������:  "+obj.symbol;
      // ����������� ����������� ����:
      JOptionPane.showMessageDialog(null,text);
   }
}