package ru.sectorsj.examples.ch07.usingAbstractClassDemo;

// ����������� ����������:
abstract class ColoredFigure{
   // ��������� ���� (����):
   String color;
   // ������������� ���� (������):
   int size;
   // �����������:
   ColoredFigure(String clr,int s){
      // ������������ �������� �����:
      color=clr;
      size=s;
   }
   // ����� ��� ����������� ���������� �� �������:
   void show(){
      // ���� � �������� ������:
      System.out.println("������: "+color+" "+getName());
      // ����������� ������:
      System.out.println("����������� ������ ("+getSizeName()+"): "+size);
      // �������:
      System.out.printf("�������: %.3f\n",getArea());
      // ����������������� "�����" �� "���������":
      String line="";
      for(int k=1;k<=30;k++){
         line+="*";
      }
      System.out.println(line);
   }
   // ����� ����������� ���������� �������� ���
   // ���������, ������������� ����������� ������ ������:
   String getSizeName(){
      return "�������";
   }
   // ����������� ������:
   abstract String getName(); // �������� ������
   abstract double getArea(); // ������� ������
}
// �������� (������ - �����������):
class Triangle extends ColoredFigure{
   // �����������:
   Triangle(String clr,int s){
      // ����� ������������ �����������:
      super(clr,s);
   }
   // �������� ������������ ������ �� �����������,
   // ������������� ����������� �������� ������:
   String getName(){
      return "�����������";
   }
   // �������� ������������ ������ �� �����������,
   // ������������� ����������� ������� ������:
   double getArea(){
      double k=Math.sqrt(3)/4;
      return size*size*k;
   }
}
// �������� (������ - �������):
class Square extends ColoredFigure{
    // �����������:
    Square(String clr,int s){
      // ����� ������������ �����������:
      super(clr,s);
   }
   // �������� ������������ ������ �� �����������,
   // ������������� ����������� �������� ������:
   String getName(){
      return "�������";
   }
   // �������� ������������ ������ �� �����������,
   // ������������� ����������� ������� ������:
   double getArea(){
      double k=1;
      return size*size*k;
   }
}
// �������� (������ - ����):
class Circle extends ColoredFigure{
   // �����������:
   Circle(String clr,int s){
   // ����� ������������ �����������:
      super(clr,s);
   }
   // �������� ������������ ������ �� �����������,
   // ������������� ����������� �������� ������:
   String getName(){
      return "����";
   }
   // �������� ������������ ������ �� �����������,
   // ������������� ����������� ������� ������:
   double getArea(){
      double k=Math.PI;
      return size*size*k;
   }
   // ��������������� ������, ������������� �����������
   // �������� ��� ���������, ������������� �����������
   // ������ ������:
   String getSizeName(){
      return "������";
   }
}
// ������� �����:
class UsingAbstractClassDemo{
   // ������� �����:
   public static void main(String[] args){
      // �������� ��������:
      Triangle T=new Triangle("�������",2); // �����������
      Square S=new Square("������",3);      // �������
      Circle C=new Circle("������",1);      // ����
      // ����������� ���������� �� �������� �����
      // ��������� ���������� ����������:
      System.out.println("������������� ��������� ���������� ���������");
      T.show();
      S.show();
      C.show();
      // ��������� ���������� ������������ �����������:
      ColoredFigure F;
      // ����������� ���������� �� �������� �����
      // ��������� ���������� ������������ �����������:
      System.out.println("������������� ��������� ���������� ������������ �����������");
      F=T;      // �����������
      F.show();
      F=S;      // �������
      F.show();
      F=C;      // ����
      F.show();
   }
}