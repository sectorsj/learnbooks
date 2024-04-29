package ru.sectorsj.examples.ch07.extendingAndImplementingDemo;

// ������ ���������:
interface First{
   // ���������� ������:
   String getFirst();
   // �������� ������:
   default void show(){
      System.out.println("��������� First: ����� show()");
   }
}
// ������ ���������:
interface Second{
   // ���������� ������:
   String getSecond();
   // �������� ������:
   default void show(){
      System.out.println("��������� Second: ����� show()");
   }
}
// ����������:
class Base{
   // �������� ������:
   String getBase(){
      return "����� Base";
   }
   // �������� ������:
   void show(){
      System.out.println("����� Base: ����� show()");
   }
}
// �������� ��������� ���������� � ��������� ����������:
class MyClass extends Base implements First, Second{
   // �������� ������:
   public String getFirst(){
      return "��������� First";
   }
   // �������� ������:
   public String getSecond(){
      return "��������� Bravo";
   }
   // �������� ������:
   public void show(){
      System.out.println("�� ����������:");
      System.out.println(getFirst());
      System.out.println(getSecond());
      System.out.println(getBase());
      // ����� ������ ������ �� ���������� First:
      First.super.show();
      // ����� ������ ������ �� ���������� Second:
      Second.super.show();
      // ����� ������ ������ �� ����������� Base:
      super.show();
   }
}
// ������� �����:
class ExtendingAndImplementingDemo{
   public static void main(String[] args){
      // �������� ������� ���������:
      MyClass obj=new MyClass();
      // ����� ������ �� �������:
      obj.show();
   }
}