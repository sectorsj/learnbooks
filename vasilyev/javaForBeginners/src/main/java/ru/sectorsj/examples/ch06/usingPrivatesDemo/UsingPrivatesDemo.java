package ru.sectorsj.examples.ch06.usingPrivatesDemo;

// ����������:
class Alpha{
   // �������� ����:
   private int code;
   // �������� ����� ��� ������������ ��������
   // ��������� ����:
   public void set(int code){
      this.code=code;
   }
   // �������� ����� ��� ����������� ��������
   // ��������� ����:
   public void show(){
      System.out.println("���� code: "+code);
   }
   // ����������� ������:
   Alpha(int code){
      set(code);
   }
}
// ��������:
class Bravo extends Alpha{
   // ����������� ���������:
   Bravo(int code){
      // ����� ������������ �����������:
      super(code);
   }
}
// ����� � ������� ������� ���������:
class UsingPrivatesDemo{
   public static void main(String[] args){
      // �������� ������� ���������:
      Bravo obj=new Bravo(100);
      // �������� �������� ����:
      obj.show();
      // ������������ �������� ����:
      obj.set(200);
      // ����������� �������� ����:
      obj.show();
   }
}