package ru.sectorsj.examples.ch07.usingInterfacesDemo;

// ������ ���������:
interface First{
   void hello();
}
// ������ ���������:
interface Second{
   void hi();
}
// ����� ��������� ��� ����������:
class MyClass implements First, Second {
   // �������� ������ �� ������� ����������:
   public void hello(){
      System.out.println("����� �� ���������� First");
   }
   // �������� ������ �� ������� ����������:
   public void hi(){
      System.out.println("����� �� ���������� Second");
   }
}
// ������� �����:
class UsingInterfacesDemo{
   public static void main(String[] args){
      // �������� �������:
      MyClass obj = new MyClass();
      // ����� ������� �� �������:
      obj.hello();
      obj.hi();
   }
}