package ru.sectorsj.examples.ch04;

import javax.swing.*;
// ����� � ������� ������� ���������:
class UsingDoWhileDemo{
   // ����������� ����� ��� ����������� ���������
   // ���� (��������� ������) ����� (�������� ������):
   static String coder(int number){
      // ��������� ���������� ��� ������ ����������:
      String s="";
      // ����� ��� ���������� ��������� ����:
      int n=number;
      do{
         // ���������� � ��������� ������ s �����
         // ���������� ��������� � �������� �������������:
         s=(n%2)+s;
         // �������� ���������� n ����������� � ��� ����:
         n/=2;
      }while(n!=0);
      return s;
   }
   // ������� ����� ���������:
   public static void main(String[] args){
      // ��������� ���������� ��� ������ ��������
      // �� ���� ����� � ���������� ����:
      String input;
      // �������� ��� ���������� ����:
      String title="���������� ��������� ����";
      // ����������� ����������� ���� ��� ����� �����:
      input=JOptionPane.showInputDialog(null,
         "������� ����� �����", // ������� ��� ����� �����
         title,                 // �������� ����
         JOptionPane.QUESTION_MESSAGE // ��� �����������
      );
      // ���� ������������ �� ���� �����:
      if(input==null){
         // ���������� ���������� ���������:
         System.exit(0);
      }
      // ����������� ����� �� ������ ������:
      int num=Integer.parseInt(input);
      // ����������� ��������� ����:
      String code=coder(num);
      // ����� ��� ����������� � ���������� ����:
      String text="�� ����� �����:  "+num;
      text+="\n�������� ��� �����:  "+code;
      // ����������� ����������� ����:
      JOptionPane.showMessageDialog(null,
         text,  // ����� ���������
         title, // �������� ����
         JOptionPane.INFORMATION_MESSAGE // ��� �����������
      );
   }
}