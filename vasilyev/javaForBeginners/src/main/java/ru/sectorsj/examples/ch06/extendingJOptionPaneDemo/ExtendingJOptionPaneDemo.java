package ru.sectorsj.examples.ch06.extendingJOptionPaneDemo;

import javax.swing.*;
// ����� ��������� ������������ ������ JOptionPane:
class MyPane extends JOptionPane{
   // ����������� ����� � ����� �����������
   // ��� ����������� ����������� ����:
   static void showMessage(String txt,String title){
      // ����� ������������ ������ showMessageDialog() ��
      // ������ JOptionPane:
      showMessageDialog(null,txt,title,PLAIN_MESSAGE, new ImageIcon("d:/books/pictures/giraffe.png"));
   }
   // ����������� ����� � ����� ����������
   // ��� ����������� ����������� ����:
   static void showMessage(String txt){
      // ����� ������ ������ � ����� �����������:
      showMessage(txt,"���������");
   }
   // ����������� ����� ��� ����������� ���� � ����� �����
   // ��� ���������� ������ �����:
   static int getInteger(String txt){
      // ��������� ����������:
      String res;
      // ����������� ���� � ����� ����� � �������
      // ������ showInputDialog() �� ������ JOptionPane:
      res=showInputDialog(null,txt,"����� (�� ���������  10)",QUESTION_MESSAGE);
      // ����������� �������� ��������� ����������:
      if(res==null){
         // ���� ������������ ������� ���� �����
         // (��������, ������������ �� ���������):
         return 10;
      }
      else{
         // �������������� ���������� ������������� �����
         // � �����:
         return Integer.parseInt(res);
      }
   }
}
// ����� � ������� ������� ���������:
class ExtendingJOptionPaneDemo{
   public static void main(String[] args){
      // ����������� ����������� ���� � ����������:
      MyPane.showMessage("���� ������!");
      // ���������� ��� ������ ��������� ��������:
      int number;
      // ����������� ����������� ���� � ����� �����
      // � ���������� �������������� ��������:
      number=MyPane.getInteger("������� ����� �����");
      // ����� ��� ����������� � ���������� ����:
      String txt="����� �� 1 �� "+number+":\n";
      // ������������ ��������� ������ �
      // ������������������� ����������� �����:
      for(int k=1;k<=number;k++){
         txt+=k+" ";
      }
      // ����������� ����������� ���� � ����������:
      MyPane.showMessage(txt,"����� �����");
   }
}