package ru.sectorsj.examples.ch08.swapFieldsDemo;

// ����� ��� �������� ��������:
class MyClass{
   // ������������� ����:
   int number;
   // �����������:
   MyClass(int n){
      number=n;
   }
}
// ����� �� ����������� ������� swap() � �������
// ������� ���������:
class SwapFieldsDemo{
   // ����������� ����� � ����� �����������, �����������
   // ��������� ������ MyClass:
   static void swap(MyClass A,MyClass B){
      System.out.println("����������� ����� swap()");
      // �������� ���� number ��������, ����������
      // ����������� ������:
      System.out.println("������ A: "+A.number);
      System.out.println("������ B: "+B.number);
      // ������� "������������" ���������� �����:
      int number=B.number;
      B.number=A.number;
      A.number=number;
      // �������� ���� number ��������, ����������
      // ����������� ������ swap()
      // (����� "������" ���������� �����):
      System.out.println("�������� ����� ��������");
      System.out.println("������ A: "+A.number);
      System.out.println("������ B: "+B.number);
      System.out.println("��������� ���������� ������ swap()");
   }
   // ������� ����� ���������:
   public static void main(String[] args){
      // �������� ��������:
      MyClass A=new MyClass(100);
      MyClass B=new MyClass(200);
      // �������� ���� number �������� A � B ��
      // ������ ������ swap():
      System.out.println("�� ������ ������ swap(): A.number="+A.number+" � B.number="+B.number);
      // ����� ������ swap():
      swap(A,B);
      // �������� ���� number �������� A � B �����
      // ������ ������ swap():
      System.out.println("����� ������ ������ swap(): A.number="+A.number+" � B.number="+B.number);
   }
}