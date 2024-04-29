package ru.sectorsj.examples.ch08.arrayOfObjectsDemo;

// ����� � ������������� �����:
class MyClass{
   // �������� ������������� ����:
   private int number;
   // �����������:
   MyClass(int n){
      number=n;
   }
   // ����� ��� ���������� �������� ����:
   int get(){
      return number;
   }
}
// ������� �����:
class ArrayOfObjectsDemo{
   // ����������� ����� ��� �������� ������� ��������:
   static MyClass[] createBinoms(int n){
      // ��������� ������ �� ��������� ����������:
      MyClass[] bins=new MyClass[n+1];
      // �������� �������, ������ �� ������� ������������
      // � ��������� ������� �������:
      bins[0]=new MyClass(1);
      // �������� �������� � ���������� �������:
      for(int k=1;k<=n;k++){
         // ��������� ����� ������ � ������ �� ����
         // ������������� ��������� �������� �������:
         bins[k]=new MyClass(bins[k-1].get()*(n-k+1)/k);
      }
      // ��������� ������:
      return bins;
   }
   // ����������� ����� ��� ����������� �������� �����
   // ��������, ����������� ������:
   static void show(MyClass[] objs){
      // ��������� �������� ��������� ����������:
      String txt="| ";
      // � ����� ������������ �������� ����� ��������,
      // ������� ��������� ������, ����������
      // ���������� ������:
      for(int k=0;k<objs.length;k++){
         txt+=objs[k].get()+" | ";
      }
      // ����������� ��������� � ���� ������:
      System.out.println(txt);
   }
   // ������� ����� ���������:
   public static void main(String[] args){
      // �������� �������� �� ��������:
      MyClass[] A=createBinoms(5);
      MyClass[] B=createBinoms(10);
      // ����������� �������� ����� �������� �� ��������:
      show(A);
      show(B);
   }
}