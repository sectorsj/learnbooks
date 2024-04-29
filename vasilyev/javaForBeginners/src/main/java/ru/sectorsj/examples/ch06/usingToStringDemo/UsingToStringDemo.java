package ru.sectorsj.examples.ch06.usingToStringDemo;

// ���������������� �����:
class MyClass{
   // ��������� ����:
   String name;
   // ������������� ����:
   int code;
   // �����������:
   MyClass(String txt,int num){
      name=txt;
      code=num;
   }
   // ��������������� ������ toString():
   public String toString(){
      // ��������� ��������� ����������:
      String txt="������ ������ MyClass\n";
      txt+="���� name: "+name+"\n";
      txt+="���� code: "+code+"\n";
      // ����������������� "�����":
      for(int k=1;k<=21;k++){
         txt+="-";
      }
      // ��������� ������:
      return txt;
   }
}
// ������� �����:
class UsingToStringDemo{
   // ������� �����:
   public static void main(String[] args){
      // �������� �������:
      MyClass obj=new MyClass("������ obj",123);
      // ������ ������� ���������� ������:
      System.out.println(obj);
   }
}