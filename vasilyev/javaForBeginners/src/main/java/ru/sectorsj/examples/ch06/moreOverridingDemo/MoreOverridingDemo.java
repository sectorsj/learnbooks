package ru.sectorsj.examples.ch06.moreOverridingDemo;

class Alpha {
   String name;
   void show(){
      System.out.println("������ "+name);
   }
   Alpha(String name){
      this.name=name;
   }
}

class Bravo extends Alpha {
   int code;
   void show(){
      // ����� ������ ������ �� �����������:
      super.show();
      System.out.println("�������� ���� "+code);
   }
   Bravo(String name, int code){
      // ����� ������������ �����������:
      super(name);
      this.code=code;
   }
}

class MoreOverridingDemo{
   public static void main(String[] args){
      Alpha objA=new Alpha("objA");
      Bravo objB=new Bravo("objB",123);
      objA.show();
      objB.show();
   }
}