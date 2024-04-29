package ru.sectorsj.examples.ch06.virtualMethodsDemo;

// ����������:
class Alpha{
   // ��������� ����:
   String name;
   // ����� ��� ����������� ���������:
   void objectCreated(){
      System.out.println("������ ������ ������ Alpha");
   }
   // ����� ��� ����������� ���������:
   void hello(){
      System.out.println("������ ������ Alpha");
   }
   // ����� ��� ����������� �������� ����:
   void show(){
      // ����� ������ ��� ����������� ���������:
      hello();
      // ����������� �������� ����:
      System.out.println("���� name: "+name);
   }
   // �����������:
   Alpha(String txt){
      // ����� ������ ��� ����������� ���������:
      objectCreated();
      // ������������ �������� ����:
      name=txt;
   }
}
// ��������:
class Bravo extends Alpha{
   // ��������������� ������:
   void objectCreated(){
      System.out.println("������ ������ ������ Bravo");
   }
   // ��������������� ������:
   void hello(){
      System.out.println("������ ������ Bravo");
   }
   // �����������:
   Bravo(String txt){
      // ����� ������������ �����������:
      super(txt);
   }
}
// ������� �����:
class VirtualMethodsDemo{
   // ������� �����:
   public static void main(String[] args){
      // �������� ������� �����������:
      Alpha objA=new Alpha("alpha");
      // ����������� �������� ����:
      objA.show();
      // �������� ������� ���������:
      Bravo objB=new Bravo("bravo");
      // ����������� �������� ����:
      objB.show();
   }
}