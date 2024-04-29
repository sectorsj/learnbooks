package ru.sectorsj.examples.ch07.usingInterfaceDemo;

// ���������:
interface MyInterface{
   // ����������� ���������:
   int NUMBER=100;
   // ���������� �������:
   int getNumber(double x);
   char getSymbol(int n);
}
// ����� ��������� ���������:
class MyClass implements MyInterface{
   // �������� �������:
   public int getNumber(double x){
      return (int)x;
   }
   public char getSymbol(int n){
      return (char)('A'+n);
   }
}
// ������� �����:
class UsingInterfaceDemo{
   public static void main(String[] args){
      MyClass obj = new MyClass();
      System.out.println("����������� ���������: "+ MyClass.NUMBER);
      System.out.println("����� �����: "+obj.getNumber(12.5));
      System.out.println("������: "+obj.getSymbol(3));
   }
}