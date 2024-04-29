package ru.sectorsj.examples.ch07.moreExtendingInterfaceDemo;

// ������ ���������:
interface First{
   // �������� ������:
   default void alpha(){
      System.out.println("��������� First: ����� alpha()");
   }
}
// ������ ���������:
interface Second extends First {
   // �������� �������:
   default void alpha(){
      // ����� ������ ������ �� ���������� First:
      First.super.alpha();
      System.out.println("��������� Bravo: ����� alpha()");
   }
   default void bravo(){
      System.out.println("��������� Bravo: ����� bravo()");
   }
}
// ����� ��������� ���������:
class MyClass implements Second {
   // �������� ������:
   public void bravo(){
      // ����� ������ ������ �� ���������� Second:
      Second.super.bravo();
      System.out.println("����� MyClass: ����� bravo()");
   }
}
// ������� �����:
class MoreExtendingInterfaceDemo{
   public static void main(String[] args){
      // �������� �������:
      MyClass obj = new MyClass();
      // ����� �������:
      obj.alpha();
      obj.bravo();
   }
}