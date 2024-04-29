package ru.sectorsj.examples.ch08.anonymousClassDemo;

// ����������� ����������:
abstract class Base{
   // ��������� ����:
   private String name;
   // �����������:
   Base(String txt){
      name=txt;
   }
   // ����� ��� ����������� �������� ���������� ����:
   void show(){
      System.out.println("��� �������: "+name);
   }
   // ���������� ������������ ������:
   abstract void hello();
}
// ������� �����:
class AnonymousClassDemo{
   public static void main(String[] args){
      // �������� ������� ���������� ������:
      Base obj=new Base("�������"){
         // �������� ������������ ������ �� �����������:
         void hello(){
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
      new Base("�������"){
         // �������� ������������ ������ �� �����������:
         void hello(){
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