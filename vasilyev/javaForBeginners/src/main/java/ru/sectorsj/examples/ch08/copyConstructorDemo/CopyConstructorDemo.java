package ru.sectorsj.examples.ch08.copyConstructorDemo;

// ����������:
class Base{
   // ��������� ����:
   String name;
   // ����������� � ��������� ����������:
   Base(String txt){
      name=txt;
   }
   // ����������� �������� �����:
   Base(Base obj){
      name=obj.name;
   }
}
// ��������:
class MyClass extends Base{
   // ������������� ����:
   int code;
   // ����������� � ��������� � ������������� �����:
   MyClass(String txt,int n){
      // ����� ������������ �����������:
      super(txt);
      // ������������ �������� �������������� ����:
      code=n;
   }
   // ����������� �������� �����:
   MyClass(MyClass obj){
      // ����� ������������ �����������:
      super(obj);
      // ������������ �������� �������������� ����:
      code=obj.code;
   }
   // ����� ��� ����������� �������� �����:
   void show(){
      // �������� ���������� ����:
      System.out.println("��������� ����: "+name);
      // �������� �������������� ����:
      System.out.println("������������� ����: "+code);
   }
}
// ������� �����:
class CopyConstructorDemo{
   public static void main(String[] args){
      // �������� ������� � ������� ������������
      // � ����� �����������:
      MyClass A=new MyClass("������",200);
      // �������� ������� � ������� ������������
      // �������� �����:
      MyClass B=new MyClass(A);
      // ��������� �������� ����� ������� �������:
      A.name="�������";
      A.code=100;
      // �������� ������� � ������� ������������
      // �������� ����� (�������� - ��������� ������):
      MyClass C=new MyClass(new MyClass("�������",300));
      // ����������� �������� �����:
      System.out.println("������ A");
      A.show();
      System.out.println("������ B");
      B.show();
      System.out.println("������ C");
      C.show();
   }
}