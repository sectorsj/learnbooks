package ru.sectorsj.examples.ch05;

import javax.swing.*;
class UsingListDemo{
   public static void main(String[] args){
      // ��������� ������ � ���������� ��������:
      String[] txt={"����","����","�������","����"};
      // ��������� ������ �� �������� ������
      // � ������������� ��������:
      String[] files={"wolf.jpg","fox.jpg","bear.jpg","raccoon.jpg"};
      // ��������� ����������, ������������ ���� �
      // ������ � ������������� ��������:
      String folder="d:/books/pictures/";
      // ����� ��� ����������� � ���������� ����:
      String msg="���� ��������?";
      // ����� � ��������� ����������� ����:
      String title="� ���� ��������";
      // ������ ��� �����������, ������������
      // � ���������� ����:
      ImageIcon img=new ImageIcon(folder+"giraffe.png");
      // ��������� ���������� ��� ������ ����������
      // ������������� ���������:
      String animal;
      // ����������� ����������� ���� �
      // �������������� ������� ��� ������ ���������:
      animal=(String)JOptionPane.showInputDialog(null,
                msg,   // ����� ��� �������������� �������
                title, // �������� ����
                JOptionPane.PLAIN_MESSAGE, // ��� ����
                img, // �����������, ������������ � ����
                txt,   // �������� ��������������� ������
                txt[0] // ��������� �� ��������� �������
      );
      // ���� ������������ ������� ����:
      if(animal==null){
         // ���������� ���������� ���������:
         System.exit(0);
      }
      // ����������� ����������� ��� ����������� �
      // ���������� ����:
      for(int k=0;k<txt.length;k++){
         // ���� ����� � ���������� animal ���������
         // � ��������� ��������� �������� � �������:
         if(animal.equals(txt[k])){
            // �������� ������� �����������:
            img=new ImageIcon(folder+files[k]);
            // ���������� ��������� �����:
            break;
         }
      }
      // ����������� ����������� ���� � ������������:
      JOptionPane.showMessageDialog(null,
         img,    // ������������ �����������
         animal, // �������� ����
         JOptionPane.PLAIN_MESSAGE // ��� ����
      );
   }
}