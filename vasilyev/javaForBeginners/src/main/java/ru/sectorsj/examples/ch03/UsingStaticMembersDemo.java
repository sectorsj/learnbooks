package ru.sectorsj.examples.ch03;

// ����� �� ������������ �������:
class MyClass6{
   // ����������� ����:
   static int count=0;
   // ����������� ��� ����������:
   MyClass6(){
      // ���������� �������� ������������ ����:
      count++;
      // ����������� ���������:
      System.out.println("������ ������ ����� "+count);
   }
   // ����������� �����:
   static void show(){
      System.out.println("���������� ��������: "+count);
   }
}
// ����� � ������� ������� ���������:
class UsingStaticMembersDemo{
   // ������� ����� ���������:
   public static void main(String[] args){
      // ����� ������������ ������:
      MyClass6.show();
      // �������� ��������:
      MyClass6 objA=new MyClass6();
      MyClass6 objB=new MyClass6();
      MyClass6 objC=new MyClass6();
      // ����� ������������ ������ ����� ������ �� �����:
      MyClass6.show();
      // ����� ������������ ������ ����� ������ �� ������:
      objC.show();
      objB.show();
   }
}