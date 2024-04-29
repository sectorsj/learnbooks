package ru.sectorsj.examples.ch04;// ������ �������:
import javax.swing.*;
// ����� � ������� ������� ���������:
class UsingIfDemo{
   // ������� ����� ���������:
   public static void main(String[] args){
      // ��������� ����������:
      String input,txt,title;
      // ������������� ����������:
      int number;
      // ��������� ���������� ��� ������ ������
      // �� ������ �����������:
      ImageIcon img;
      // ����������� ���� � ����� �����:
      input=JOptionPane.showInputDialog(null,
         "������� ����� �����", // ������� ��� ����� �����
         "�������� �����",      // ��������� ����
         JOptionPane.QUESTION_MESSAGE  // ��� �����������
      );
      // ��������, �������� �� ����:
      if(input==null){ // ���� ���� �� ��������
         // ����������� ����������� ����:
         JOptionPane.showMessageDialog(null,
            "�� �� ����� �����!",       // ���������
            "������ �����",             // ��������� ����
            JOptionPane.ERROR_MESSAGE   // ��� ����
         );
         // ���������� ���������� ���������:
         System.exit(0);
      }
      // �������������� ������ � �����:
      number=Integer.parseInt(input);
      // �������� ����� �� ��������/����������:
      if(number%2==0){ // ���� ����� ������
         // �������� ������� �����������:
         img=new ImageIcon("d:/books/pictures/even.png");
         // ����� ���������:
         txt="����� "+number+" - ������!";
         // ��������� ����:
         title="������ �����";
      }
      else{ // ���� ����� ��������
         // �������� ������� �����������:
         img=new ImageIcon("d:/books/pictures/odd.png");
         // ����� ���������:
         txt="����� "+number+" - ��������!";
         // ��������� ����:
         title="�������� �����";
      }
      // ����������� ����������� ����:
      JOptionPane.showMessageDialog(null,
         txt,                       // ����� ���������
         title,                     // ��������� ����
         JOptionPane.PLAIN_MESSAGE, // ��� ���������
         img                        // �����������
      );
   }
}