package ru.sectorsj.examples.ch08.objectAsResultDemo;

// �����:
class MyClass{
   // �������� ����:
   private int code;
   private String name;
   // �����������:
   MyClass(int n,String s){
      System.out.println("�������� �������:");
      // ������������ �������� ����� �
      // ����������� ���� ��������:
      set(n,s).show();
   }
   // ����� ��� ������������ �������� �������������� ����,
   // ������������ ����������� ������ �� ������:
   MyClass set(int n){
      // ������������ �������� �������������� ����:
      code=n;
      // ��������� ������:
      return this;
   }
   // ����� ��� ������������ �������� ���������� ����,
   // ������������ ����������� ������ �� ������:
   MyClass set(String s){
      // ������������ �������� ���������� ����:
      name=s;
      // ��������� ������:
      return this;
   }
   // ����� ��� ������������ �������� �����,
   // ������������ ����������� ������ �� ������:
   MyClass set(int n,String s){
      // ������������ �������� ����� � ��������� ������:
      return set(n).set(s);
   }
   // ����� ��� ����������� �������� �����:
   void show(){
      System.out.println("���� code="+code);
      System.out.println("���� name="+name);
      System.out.println("-----------------");
   }
}
// ������� �����:
class ObjectAsResultDemo{
   // ����������� ����� ��� �������� �������:
   static MyClass createObject(int n,String s){
      // ��������� ������:
      return new MyClass(n,s);
   }
   // ������� ����� ���������:
   public static void main(String[] args){
      // �������� �������:
      MyClass obj=createObject(100,"alpha");
      // ��������� �������� �������������� ���� � 
      // ����������� �������� ����� �������:
      obj.set(200).show();
      // ��������� �������� ���������� ���� � 
      // ����������� �������� ����� �������:
      obj.set("bravo").show();
      // ����������� �������� �����:
      obj.show();
      // �������� �������, ��������� �������� ��� �����
      // � ����� ������ ��� ����������� �������� �����:
      createObject(300,"charlie").set(400,"delta").show();
   }
}