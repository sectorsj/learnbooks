package ru.sectorsj.examples.ch07.usingDefaultMethodsDemo;

// ��������� � �������, ������� ��� �� ���������:
interface Base{
   // ����� � ����� �� ���������:
   default void show(String txt){
      System.out.println("��������� Base: "+txt);
   }
   // ���������� ������:
   void hello();
}


// ����� ��������� ��������� Base:
class Alpha implements Base {
   // �������� �������� ������:
   public void hello(){
      System.out.println("������ ������ Alpha");
   }
   // �������� ������ � ����� �� ���������:
   public void show(String txt){
      System.out.println("����� Alpha: "+txt);
   }
}


// ����� ��������� ��������� Base:
class Bravo implements Base {
   // �������� �������� ������:
   public void hello(){
      System.out.println("������ ������ Bravo");
   }
}



// ������� �����:
class UsingDefaultMethodsDemo{
   public static void main(String[] args){
      // ������������ ����������:
      Base ref;
      // ������ ������ Alpha:
      Alpha objA=new Alpha();
      // ����� ������� ����� ��������� ����������:
      objA.hello();
      objA.show("��������� ���������� objA");
      // ������������ ���������� ������������� ������
      // �� ������ ������ Alpha:
      ref=objA;
      // ����� ������ ����� ������������ ����������:
      ref.show("������������ ���������� ref");
      // ������ ������ Bravo:
      Bravo objB=new Bravo();
      // ����� ������� ����� ��������� ����������:
      objB.hello();
      objB.show("��������� ���������� objB");
      // ������������ ���������� ������������� ������
      // �� ������ ������ Bravo:
      ref=objB;
      // ����� ������ ����� ������������ ����������:
      ref.show("������������ ���������� ref");
   }
}