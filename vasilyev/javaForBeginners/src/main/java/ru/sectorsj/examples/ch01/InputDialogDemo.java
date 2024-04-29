package ru.sectorsj.examples.ch01;// Импорт класса JOptionPane:

import javax.swing.*;
// Описание класса:
class InputDialogDemo{
   // Главный метод:
   public static void main(String[] args){
      // Переменная для записи текста:
      String text;
      // Отображения диалогового окна с полем вода:
      text=JOptionPane.showInputDialog("Введите текст:");
      // Отображение диалогового окна с сообщением:
      JOptionPane.showMessageDialog(null,"Вы ввели такой текст:\n"+text);
   }
}