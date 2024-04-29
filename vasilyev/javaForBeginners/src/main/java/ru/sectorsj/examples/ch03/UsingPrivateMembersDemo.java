package ru.sectorsj.examples.ch03;

// ����� � ��������� �������:
class MyClass5 {
   // �������� ����������� ����:
   private static int count=0;
   // �������� ������������� ����:
   private int number;
   private String name;
   // ����������� ��� ����������:
   MyClass5(String n){
      // ���������� �������� ������������ ����:
      count++;
      // ������������ �������� ������������� �����:
      name=n;
      number=count;
      // ����������� ���������:
      System.out.println("������ ������ � ������ "+name);
   }
   // ����� ��� ����������� ���������:
   public void show(){
      System.out.println("�������� �������: "+name);
      System.out.println("����� �������: "+number);
      System.out.println("���������� ��������: "+count);
   }
   // ����� ��� ������������ �������� ���������
   // ���������� ����:
   public void set(String n){
      name=n;
   }
}
// ����� � ������� ������� ���������:
class UsingPrivateMembersDemo{
   // ������� ����� ���������:
   public static void main(String[] args){
      // �������� ��������:
      MyClass5 objA = new MyClass5("Alpha");
      MyClass5 objB = new MyClass5("Bravo");
      MyClass5 objC = new MyClass5("Charlie");
      // ����� ������ ��� ������� �� ��������:
      objA.show();
      objB.show();
      objC.show();
      // ��������� ���� ������� �������:
      objB.set("������ ������");
      // ����������� �������� ����� �������:
      objB.show();
   }
}