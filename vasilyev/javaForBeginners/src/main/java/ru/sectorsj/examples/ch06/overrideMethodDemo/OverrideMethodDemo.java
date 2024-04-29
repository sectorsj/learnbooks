package ru.sectorsj.examples.ch06.overrideMethodDemo;

// ����������:
class Alpha{
   // ��������� ����:
   String name;
   // ����� ��� ����������� �������� ���������� ����:
   void show(){
      System.out.println("������ ������ Alpha:");
      System.out.println("���� name - "+name);
   }
   // ����������� ������:
   Alpha(String name){
      this.name=name;
   }
}
// ��������:
class Bravo extends Alpha{
   // ������������� ����:
   int code;
   // ��������������� ������. ����� ������� ������
   // ������������ �������� ���� �����:
   void show(){
      System.out.println("������ ������ Bravo:");
      System.out.println("���� name - "+name);
      System.out.println("���� code - "+code);
   }
   // ����������� ������:
   Bravo(String name,int code){
      // ����� ������������ �����������:
      super(name);
      this.code=code;
   }
}
// ������� �����:
class OverrideMethodDemo{
   // ������� �����:
   public static void main(String[] args){
      // �������� ������� �����������:
      Alpha objA=new Alpha("objA");
      // �������� ������� ���������:
      Bravo objB=new Bravo("objB",123);
      // ����� ������ �� ������� �����������:
      objA.show();
      // ����� ������ �� ������� ���������:
      objB.show();
   }
}