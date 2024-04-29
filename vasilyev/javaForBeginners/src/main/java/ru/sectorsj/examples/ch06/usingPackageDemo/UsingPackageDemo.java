// �����:
package ru.sectorsj.examples.ch06.usingPackageDemo;
// ����������� ������:

import static javax.swing.JOptionPane.WARNING_MESSAGE;
import static javax.swing.JOptionPane.showMessageDialog;
// ������� �����:
class UsingPackageDemo{
   // ������� �����:
   public static void main(String[] args){
      // ����������� ����������� ���� � ����������:
      showMessageDialog(null,
         // ����� ���������:
         "����������� ������ - ��� ������!",
         // �������� ����:
         "����� mypack",
         // ��� ����:
         WARNING_MESSAGE
      );
   }
}