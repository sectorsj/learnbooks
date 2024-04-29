package ru.sectorsj._18_files_and_cmd_arguments._685_buffered_reader_writer_demo;

import java.io.*;

// ������� �����:
public class BufferedReaderWriterDemo {
    // ������� �����:
    public static void main(String[] args) {
        System.out.println("���������� ����������� �����");
        // ���� � ����������:
        String path = "D:\\filesEvgeniy\\my_projects\\coding\\projects\\java\\java_practice\\resources\\documents\\";

        // ��������� ���������� ��� ������
        // ����������� �� ����� �����:
        String str;

        // �������������� ���:
        try {
            // ������ ����������������� ������ �����:
            BufferedReader input = new BufferedReader(new FileReader(path + "MyNewText.txt"));

            // ������ ����������������� ������ ������:
            BufferedWriter output = new BufferedWriter(new FileWriter(path + "MyFiles\\MyVeryNewText.txt"));

            // ���������� - ������� �����:
            int k = 1;

            // ���������� ����� �� ������ �����
            // � ������ � ������ ����, �� ��� ��� ����
            // ������ ���. ������ ����� �� ������:
            while ((str = input.readLine()) != null) {
                // ������ ������ � ����:
                output.write("[" + k + "] " + str.toLowerCase());

                // ������� � ����� ������:
                output.newLine();

                // ����� �������� ���������� - ��������:
                k++;
            }
            // ��������� ������:
            input.close();
            output.close();
        }
        // ��������� ����������:
        catch (FileNotFoundException e) {
            System.out.println("���� �� ���������" + e);
        }
        catch (IOException e){
            System.out.println("������ ������� � �����" + e);
        }
        System.out.println("����������� ���������");
    }
}
