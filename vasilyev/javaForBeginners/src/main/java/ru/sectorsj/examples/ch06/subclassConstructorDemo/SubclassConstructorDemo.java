package ru.sectorsj.examples.ch06.subclassConstructorDemo;

// ����������:
class Alpha{
   // ��������� ����:
   String name;
   // ������������� ����:
   int code;
   // ����������� � ����� �����������:
   Alpha(String name,int code){
      this.name=name;
      this.code=code;
      System.out.println("����� Alpha:");
      System.out.println("���� name - "+this.name);
      System.out.println("���� code - "+this.code);
   }
   // ����������� � ����� ��������� ����������:
   Alpha(String name){
      // ����� ������������ � ����� �����������:
      this(name,0);
   }
   // ����������� � ����� ������������� ����������:
   Alpha(int code){
      // ����� ������������ � ����� �����������:
      this("�����",code);
   }
   // ����������� ��� ����������:
   Alpha(){
      this("������",1);
   }
}
// ��������:
class Bravo extends Alpha{
   // ���������� ����:
   char symbol;
   // �������� ����� ��� ����������� ��������
   // ����������� ����:
   private void show(){
      System.out.println("����� Bravo:");
      // ����������� �������� ����������� ����:
      System.out.println("���� symbol - "+this.symbol);
      // ����������� "�������������� �����":
      for(int k=1;k<=18;k++){
         System.out.print("-");
      }
      System.out.println("");
   }
   // ����������� � ����� �����������:
   Bravo(String name,int code,char symbol){
      // ����� ������������ �����������
      // � ����� �����������:
      super(name,code);
      // ������������ ����������� ���� ��������:
      this.symbol=symbol;
      // ����� ��������� ������:
      show();
   }
   // ����������� � ����� ���������� ����������:
   Bravo(char symbol){
      // ����� ������������ ����������� ��� ����������:
      super();
      // ������������ ����������� ���� ��������:
      this.symbol=symbol;
      // ����� ��������� ������:
      show();
   }
   // ����������� � ����� ��������� ����������:
   Bravo(String name){
      // ����� ������������ �����������
      // � ����� ��������� ����������:
      super(name);
      // ������������ ����������� ���� ��������:
      this.symbol='A';
      // ����� ��������� ������:
      show();
   }
   // ����������� � ����� ������������� ����������:
   Bravo(int code){
      // ����� ������������ �����������
      // � ����� ������������� ����������:
      super(code);
      // ������������ ����������� ���� ��������:
      this.symbol='B';
      // ����� ��������� ������:
      show();
   }
   // ����������� ��� ����������:
   Bravo(){
      // ������� ������ ���������� �����������
      // ����������� ��� ����������.
      // ������������ �������� ����������� ����:
      this.symbol='C';
      // ����� ��������� ������:
      show();
   }
   // ����������� � ����� �����������:
   Bravo(String name,int code){
      // ����� ������������ ��������� � ����� �����������:
      this(name,code,'D');
   }
}
// ����� � ������� ������� ���������:
class SubclassConstructorDemo{
   public static void main(String[] args){
      // ��������� ���������� ���������:
      Bravo obj;
      // ������ ������� �������� ������� ���������:
      obj = new Bravo();
      obj = new Bravo("Красный");
      obj = new Bravo(100);
      obj = new Bravo("Зеленый", 200);
      obj = new Bravo('Y');
      obj = new Bravo("Синий", 300, 'Z');
   }
}