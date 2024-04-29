package ru.sectorsj.examples.ch03;

import javax.swing.*;
// �������� ������:
class MyClass4{
   // ���� ������:
   int number;
   char symbol;
   // ����� ��� ������������ �������� �����:
   void set(int n,char s){
      number=n;
      symbol=s;
   }
   // ������� ������������ ��������� ������
   // � ��������� �������:
   String getInfo(){
      // �����, ������� ������������
      // ����������� ������:
      String text="�����:  "+number+"\n";
      text+="������:  "+symbol;
      // ��������� ������:
      return text;
   }
}
// �������� ������ � ������� ������� ���������:
class UsingObjectWithMethodsDemo{
   // ������� ����� ���������:
   public static void main(String[] args){
      // �������� ������� �������:
      MyClass4 objA=new MyClass4();
      // �������� ������� �������:
      MyClass4 objB=new MyClass4();
      // ������������ �������� ����� ������� �������:
      objA.set(100,'A');
      // ������������ �������� ����� ������� �������:
      objB.set(200,'B');
      // ����������� ������� ����������� ����:
      JOptionPane.showMessageDialog(null,
         objA.getInfo(),  // ������������ �����
         "������ ������", // ��������� ����
         JOptionPane.INFORMATION_MESSAGE); // ��� ����
      // ����������� ������� ����������� ����:
      JOptionPane.showMessageDialog(null,
         objB.getInfo(),  // ������������ �����
         "������ ������", // ��������� ����
         JOptionPane.INFORMATION_MESSAGE); // ��� ����
   }
}