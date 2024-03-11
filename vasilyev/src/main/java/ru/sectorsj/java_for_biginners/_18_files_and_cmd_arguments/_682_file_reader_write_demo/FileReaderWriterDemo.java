package ru.sectorsj.java_for_biginners._18_files_and_cmd_arguments._682_file_reader_write_demo;

import java.io.*;

// ������� �����:
class FileReaderWriterDemo {
    // ������� �����:
    public static void main(String[] args) {
        System.out.println("���������� ����������� �����");
        // ���� � ����������:
        String path = "D:\\filesEvgeniy\\my_projects\\coding\\projects\\java\\java_practice\\resources\\documents\\";

        // ���������� ��� ������ ����� ����������� ������:
        int sm;

        // �������������� ���:
        try {
            // ������ ��������� ������ �����:
            FileReader input = new FileReader(path + "MyFiles\\MyText.txt");

            // ������ ��������� ������ ������:
            FileWriter output = new FileWriter(path + "MyNewText.txt");

            // ���������� ���� ������� �� �����:
            sm = input.read();

            // ���������� ���� ������� �� ������ �����
            // � ������ � ������ ����:
            while (sm != -1) { // ���� �� ��������� ����� �����
                // ������ ������� � ����:
                output.write(Character.toUpperCase((char)sm));
                // ���������� ���� ������� �� �����:
                sm = input.read();
            }
            // ������ �����������:
            input.close();
            output.close();
        }
        // ��������� ����������
        catch (FileNotFoundException e) {
            System.out.println("���� �� ������: " +  e);
        }
        catch (IOException e) {
            System.out.println("������ ������� � �����: " + e);
        }
        System.out.println("����������� ����� ���������.");
    }
}
