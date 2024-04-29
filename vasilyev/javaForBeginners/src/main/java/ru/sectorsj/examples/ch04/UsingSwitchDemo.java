package ru.sectorsj.examples.ch04;

class UsingSwitchDemo{
   // ����� ��� ����������� ��� ������ �� ������:
   static String getDay(int num){
      // ��������� ���������� ��� ������ ����������:
      String day;
      // �������� ������ ��� ����������� ��� ������:
      switch(num){
         case 1:
            day="�����������";
            break;
         case 2:
            day="�������";
            break;
         case 3:
            day="�����";
            break;
         case 4:
            day="�������";
            break;
         case 5:
            day="�������";
            break;
         case 6:
            day="�������";
            break;
         case 7:
            day="�����������";
            break;
         default:
            day="����������";
      }
      // ��������� ������:
      return day;
   }
   // ����� ��� ����������� ������ � �������� ����:
   static String testDay(int num){
      // ���������� ��� ������ ����������:
      String day;
      // �������� ������ ��� �����������
      // ������ � ������� ����:
      switch(num){
         case 1:
         case 2:
         case 3:
         case 4:
         case 5:
            day="������ ����";
            break;
         case 6:
         case 7:
            day="�������� ����";
            break;
         default:
            day="����������";
      }
      // ��������� ������:
      return day;
   }
   // ������� ����� ���������:
   public static void main(String[] args){
      // �������� �����:
      for(int k=0;k<=8;k++){
         // ����� ����������� �������:
         System.out.println(k+": "+getDay(k)+"\t- "+testDay(k));
      }
   }
}