package ru.sectorsj._18_files_and_cmd_arguments._680_file_input_output_demo;

import java.io.*;

// ������� �����:
class FileInputOutputDemo {
    // ������� �����:
    public static void main(String[] args) {
        System.out.println("���������� ����������� �����.");

        // ���� � ����������:
        String path = "D:\\filesEvgeniy\\my_projects\\coding\\projects\\java\\java_practice\\resources\\documents\\";

        // ���������� ��� ������ ����������� ������:
        int bt;

        // ������������� ���:
        try {
            // ������ ��������� ������ �����:
            FileInputStream input = new FileInputStream(path + "MyFiles\\MyCV.pdf");

            // ������ ��������� ������ ������:
            FileOutputStream output = new FileOutputStream(path + "MyData.pdf");

            // ���������� ����� �� �����:
            bt = input.read();
            // ���������� ������ �� ������ �����
            // � ������ � ������ ����:
            while (bt != -1) { // ���� �� ��������� ����� �����
                // ������ ������ � ����:
                output.write(bt);
                // ���������� ������ �� �����:
                bt = input.read();
            }
            // ������ �����������:
            input.close();
            output.close();

        // ��������� ����������:
        } catch (FileNotFoundException e) {
            System.out.println("���� �� ������ " + e);
        } catch (IOException e) {
            System.out.println("������ ������� � �����: " + e);
        }
        System.out.println("����������� ����� ���������.");
    }
}
