package ru.sectorsj.examples.ch03;

// �������� ������:
class MyClass2 {
   // ���� ������:
   int number;
   char symbol;
   // ����������� ������ ��� ����������:
   MyClass2(){
      // ������������ �������� �����:
      number=100;
      symbol='A';
   }
   // ����������� ������ � ����� �����������:
   MyClass2(int n, char s){
      // ������������ �������� �����:
      number=n;
      symbol=s;
   }
   // ����� ��� ����������� �������� ����� �������:
   void show(){
      System.out.println("�������� ����� "+number+" � "+symbol);
   }
}
// �������� ������ � ������� ������� ���������:
class UsingConstructorDemo{
   // ������� ����� ���������:
   public static void main(String[] args){
      // �������� ������� �������
      // (���������� ����������� ��� ����������):
      MyClass2 objA=new MyClass2();
      // �������� ������� �������
      // (���������� ����������� � ����� �����������):
      MyClass2 objB=new MyClass2(200,'B');
      // ����������� �������� ����� ������� �������:
      System.out.println("������ objA:");
      objA.show();
      // ����������� �������� ����� ������� �������:
      System.out.println("������ objB:");
      objB.show();
   }
}