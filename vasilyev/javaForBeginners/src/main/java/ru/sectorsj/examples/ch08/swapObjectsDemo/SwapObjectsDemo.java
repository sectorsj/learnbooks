package ru.sectorsj.examples.ch08.swapObjectsDemo;

class MyClass{
   int number;
   MyClass(int n){
      number=n;
   }
}
class SwapObjectsDemo{
   static void swap(MyClass A,MyClass B){
      System.out.println("����������� ����� swap()");
      System.out.println("������ A: "+A.number);
      System.out.println("������ B: "+B.number);
      // ��������� "������������" ����������:
      MyClass X=B;
      B=A;
      A=X;
      System.out.println("�������� ���������� ��������");
      System.out.println("������ A: "+A.number);
      System.out.println("������ B: "+B.number);
      System.out.println("��������� ���������� ������ swap()");
   }
   public static void main(String[] args){
      MyClass A=new MyClass(100);
      MyClass B=new MyClass(200);
      System.out.println("�� ������ ������ swap(): A.number="+A.number+" � B.number="+B.number);
      swap(A,B);
      System.out.println("����� ������ ������ swap(): A.number="+A.number+" � B.number="+B.number);
   }
}