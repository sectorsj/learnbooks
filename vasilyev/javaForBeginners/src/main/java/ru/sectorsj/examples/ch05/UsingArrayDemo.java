package ru.sectorsj.examples.ch05;

import javax.swing.*;
class UsingArrayDemo{
   public static void main(String[] args){
      // ��������� ���������� ��� ������ �������� � ����
      // ����� � �������� ��� ���������� ����:
      String input,title="������������ ������������";
      // ����������� ���� � ����� �����:
      input=JOptionPane.showInputDialog(null,
         // ������� ��� ����� �����:
         "������� �������� ������� �������",
         // �������� ����:
         title,
         // ��� �����������:
         JOptionPane.QUESTION_MESSAGE
      );
      // ���� ������������ ������� ����:
      if(input==null){
         // ���������� ���������� ���������:
         System.exit(0);
      }
      // ���������� ��� ������ �������� ������� �������:
      int n;
      // ����������� ��������� �������� �� ������ ������:
      n=Integer.parseInt(input);
      // �������� ������������ ��������� ��������:
      if(n<0){ // ���� ������� ������������ ��������
         // ����������� ����������� ����:
         JOptionPane.showMessageDialog(null,
            // ����� ���������:
            "������ �������� ��������!",
            // �������� ����:
            title,
            // ��� �����������:
            JOptionPane.ERROR_MESSAGE
         );
         // ���������� ���������� ���������:
         System.exit(0);
      }
      // �������� �������:
      int[] binoms=new int[n+1];
      // �������� ������� �������� �������:
      binoms[0]=1;
      // ����� ��� ����������� � ���������� ����:
      String txt="���������� �������:\n| "+binoms[0]+" |";
      // ���������� �������� ��������� �������:
      for(int m=1;m<binoms.length;m++){
         // �������� ��������:
         binoms[m]=binoms[m-1]*(n-m+1)/m;
         // � ����� ������������ �������� ��������:
         txt+=" "+binoms[m]+" |";
      }
      // ����������� ����������� ����:
      JOptionPane.showMessageDialog(null,
         // ����� ���������:
         txt,
         // �������� ����:
         title,
         // ��� �����������:
         JOptionPane.INFORMATION_MESSAGE
      );
   }
}