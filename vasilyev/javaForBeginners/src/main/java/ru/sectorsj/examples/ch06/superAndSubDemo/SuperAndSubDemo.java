package ru.sectorsj.examples.ch06.superAndSubDemo;

// ����������:
class Alpha{
   // ��������� ����:
   String name;
   // ����� ��� ����������� �������� ����:
   void show(){
      // ��������� ��������� ����������:
      String txt="������ ������ Alpha\n";
      txt+="���� name: "+name+"\n";
      for(int k=1;k<=20;k++){
         txt+="-";
      }
      // ����������� ���������:
      System.out.println(txt);
   }
}
// ��������:
class Bravo extends Alpha{
   // ������������� ����:
   int code;
   // ��������������� ������:
   void show(){
      // ��������� ��������� ����������:
      String txt="������ ������ Bravo\n";
      txt+="���� name: "+name+"\n";
      txt+="���� code: "+code+"\n";
      for(int k=1;k<=20;k++){
         txt+="-";
      }
      // ����������� ���������:
      System.out.println(txt);
   }
}
// ������� �����:
class SuperAndSubDemo{
   // ������� �����:
   public static void main(String[] args){
      // �������� ������� �����������:
      Alpha objA=new Alpha();
      // ������������ �������� ���� ������� �����������:
      objA.name="alpha";
      // ����� ������ �� ������� �����������:
      objA.show();
      // �������� ������� ���������:
      Bravo objB=new Bravo();
      // ������������ �������� ����� ������� ���������:
      objB.name="bravo";
      objB.code=123;
      // ����� ������ �� ������� ���������:
      objB.show();
      // ���������� ����������� ��������� �������������
      // ������ �� ������ ���������:
      objA=objB;
      // �������� ���� ������� ��������� ����������
      // ����� ���������� �����������:
      objA.name="charlie";
      // ����� ������ �� ������� ���������
      // ����� ���������� �����������:
      objA.show();
      // ����� ������ �� ������� ���������
      // ����� ���������� ���������:
      objB.show();
   }
}