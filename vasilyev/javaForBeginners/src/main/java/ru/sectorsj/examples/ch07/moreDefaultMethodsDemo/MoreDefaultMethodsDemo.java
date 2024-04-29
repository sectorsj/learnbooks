package ru.sectorsj.examples.ch07.moreDefaultMethodsDemo;

// ������ ���������:
interface First{
   default void hello(){
      System.out.println("����� �� ���������� First");
   }
}
// ������ ���������:
interface Second{
   default void hello(){
      System.out.println("����� �� ���������� Second");
   }
}
// ����� ��������� ��� ����������:
class MyClass implements First, Second {
   // �������� ������:
   public void hello(){
      // ����� ������ ������ �� ���������� First:
      First.super.hello();
      // ����� ������ ������ �� ���������� Second:
      Second.super.hello();
   }
}
// ������� �����:
class MoreDefaultMethodsDemo{
   public static void main(String[] args){
      // �������� �������:
      MyClass obj = new MyClass();
      // ����� ������:
      obj.hello();
   }
}