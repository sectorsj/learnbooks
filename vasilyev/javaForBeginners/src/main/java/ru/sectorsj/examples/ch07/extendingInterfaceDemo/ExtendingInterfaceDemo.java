package ru.sectorsj.examples.ch07.extendingInterfaceDemo;

// ����������� ���������:
interface First{
   // ����� � ����� �� ���������:
   default void alpha(){
      System.out.println("��������� First: ����� alpha()");
   }
   // ����� � ����� �� ���������:
   default void bravo(){
      System.out.println("��������� First: ����� bravo()");
   }
   // ����� � ����� �� ���������:
   default void charlie(){
      System.out.println("��������� First: ����� charlie()");
   }
   // ����� ��� ���� �� ���������:
   void delta();
}
// ���������-���������:
interface Second extends First {
   // ���������� ������:
   void bravo();
   // ����� � ����� �� ���������:
   default void charlie(){
      System.out.println("��������� Second: ����� charlie()");
   }
   // ���������� ������:
   void echo();
}
// ����� ��������� ���������:
class MyClass implements Second {
   // �������� �������:
   public void bravo(){
      System.out.println("����� MyClass: ����� bravo()");
   }
   public void delta(){
      System.out.println("����� MyClass: ����� delta()");
   }
   public void echo(){
      System.out.println("����� MyClass: ����� echo()");
   }
}
// ������� �����:
class ExtendingInterfaceDemo{
   public static void main(String[] args){
      // �������� �������:
      MyClass obj = new MyClass();
      // ����� �������:
      obj.alpha();
      obj.bravo();
      obj.charlie();
      obj.delta();
      obj.echo();
   }
}