package ru.sectorsj.examples.ch08.methodArgumentsDemo;

class MethodArgumentsDemo{
   // ����������� ����� � ����� �������������� �����������,
   // ������� "������������" ����������:
   static void swap(int a,int b){
      System.out.println("����������� ����� swap()");
      // �������� ���������� ������ ��
      // ��������� ��������:
      System.out.println("��������� �� ��������� ��������: "+a+" � "+b);
      // ��������� "������������" ����������:
      int x=b;
      b=a;
      a=x;
      // �������� ���������� ������ �����
      // ��������� ��������:
      System.out.println("��������� ����� ��������� ��������: "+a+" � "+b);
      System.out.println("��������� ���������� ������ swap()");
   }
   // ������� ����� ���������:
   public static void main(String[] args){
      // ������������� ����������:
      int m=100,n=200;
      // �������� ���������� �� ������ ������ swap():
      System.out.println("���������� �� ������ ������ swap(): "+m+" � "+n);
      // ����� ������ swap():
      swap(m,n);
      // �������� ���������� ����� ������ ������ swap():
      System.out.println("���������� ����� ������ ������ swap(): "+m+" � "+n);
   }
}