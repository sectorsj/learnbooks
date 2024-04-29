package ru.sectorsj.examples.ch05;// ������ �������:

import javax.swing.*;
import java.util.Random;
// ����� � ������� ������� ���������:
class UsingForArrayDemo{
   // ������� ����� ���������:
   public static void main(String[] args){
      // ������ �������:
      int size=10;
      // ������ ��� ������������� ��������� �����:
      Random rnd=new Random();
      // �������� �������:
      int[] nums=new int[size];
      // ����� ��� ����������� � ���������� ����:
      String txt="������ ��������� �����:\n| ";
      // ���������� ������� ���������� �������:
      for(int k=0;k<nums.length;k++){
         // ������������ ��������� ��������
         // ���������� �����:
         nums[k]=rnd.nextInt(10)+1;
         // ���������� � ������ �������� ��������:
         txt+=nums[k]+" | ";
      }
      // ���������� ���������� ��������:
      txt+="\n��������:\n| ";
      // ����������� ��������� � �������
      // ��������� ����� �� ���������:
      for(int s: nums){
         // ���������� � ����� �������� ��������:
         txt+=s+" | ";
      }
      // ����������� ����������� ����:
      JOptionPane.showMessageDialog(null,
         txt, // ����� ��������� � ����
         "��������� �����", // �������� ����
         JOptionPane.PLAIN_MESSAGE // ��� ����
      );
   }
}