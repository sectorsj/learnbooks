package ru.sectorsj.examples.ch07.usingInterfaceVarsDemo;

// ���������:
interface Base{
   // ���������� ������:
   void show();
}
// ����� ��������� ��������� Base:
class Alpha implements Base {
   // ��������� ����:
   String word;
   // �����������:
   Alpha(String txt){
      word=txt;
   }
   // �������� ������ �� ����������:
   public void show(){
      System.out.println("������ ������ Alpha");
      System.out.println("��������� ����: "+word);
   }
}
// ����� ��������� ��������� Base:
class Bravo implements Base {
   // ������������� ����:
   int number;
   // �����������:
   Bravo(int n){
      number=n;
   }
   // �������� ������ �� ����������:
   public void show(){
      System.out.println("������ ������ Bravo");
      System.out.println("������������� ����: "+number);
   }
}
// ������� �����:
class UsingInterfaceVarsDemo{
   public static void main(String[] args){
      // ������������ ����������:
      Base ref;
      // ������ ������ Alpha:
      ref = new Alpha("�����");
      ref.show();
      // ������ ������ Bravo:
      ref = new Bravo(123);
      ref.show();
   }
}