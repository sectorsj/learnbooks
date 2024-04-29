package ru.sectorsj.examples.ch08.moreAnonymousClassDemo;

// ���������:
interface Base{
   // ����� � ����� �� ���������:
   default void show(){
      System.out.println("��������� Base");
   }
   // ���������� ������:
   void hello();
}
// ������� �����:
class MoreAnonymousClassDemo{
   public static void main(String[] args){
      // �������� ������� ���������� ������:
      Base obj=new Base(){
         // �������� ������ �� ����������:
         public void hello(){
            System.out.println("������ ���������� ������");
         }
      }; // ���������� ���������� �������� �������
         // ���������� ������
      // ����� ������� �� �������, ���������� �� ������
      // ���������� ������:
      obj.show();
      obj.hello();
      // �������� ���������� ������� ���������� ������
      // � ����� �� ����� ������� ������ showAll(),
      // ���������� � ��������� ������:
      new Base(){
         // �������� ������ �� ����������:
         public void hello(){
            System.out.println("��������� ������");
         }
         // �������� ������ ������:
         void showAll(){
            hello();
            show();
         }
      }.showAll(); // ����� ������
   }
}