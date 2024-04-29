package ru.sectorsj._18_files_and_cmd_arguments._688_file_chooser_demo;

// ����������� ������:
import static javax.swing.JOptionPane.*;

// ������������� ������:
import javax.swing.*;
import java.io.*;

// ������� �����:
public class FileChooserDemo {
    // ������� �����
    // (����������� �������������� ���������� IOException):
    public static void main(String[] args) throws IOException {
        // ����������� ���� �������������:
        int res = showConfirmDialog(null,
                "������ ������� ����?",     // ����� � ����
                "������ � �������",                 // �������� ����
                YES_NO_OPTION,                      // ���������� � ��� ������
                QUESTION_MESSAGE                    // ��� �����������
        );
        // ���� �� ������ ������ �������������:
        if (res != YES_NO_OPTION) {
            // ���������� ���������� ���������:
            System.exit(0);
        }
        // �������� ������� JFileChooser:
        JFileChooser fch = new JFileChooser();

        // ����������� ���� ��� ������ �����:
        res = fch.showOpenDialog(null);

        // ���� �� ����������� ����� �����:
        if (res !=JFileChooser.APPROVE_OPTION) {
            // ���������� ���������� ���������:
            System.exit(0);
        }
        // ������ ������ File, ������������
        // ����, ��������� � ���� ������ ������:
        File F = fch.getSelectedFile();

        // ������������ ������ ��� ����������� � ���������:
        String txt = "�� ������� ����\n";

        // ���� � �����
        txt += F.getAbsolutePath();
        txt += "\n������ ������� �����?";

        // ����������� ���� �������������:
        res = showConfirmDialog(null,
                txt,                // ����� ���������
                "���� ������",      // �������� ����
                YES_NO_OPTION,      // ���������� � ��� ������
                QUESTION_MESSAGE    // ��� �����������
        );
        // ���� �� ������ ������ �������������:
        if (res != YES_OPTION) {
            // ���������� ���������� ���������:
            System.exit(0);
        }
        // ����������� ���� ��� ���������� �����:
        res = fch.showSaveDialog(null);

        // ���� ����� �� �����������:
        if (res != JFileChooser.APPROVE_OPTION) {
            // ���������� ���������� ���������:
            System.exit(0);
        }
        // �������� ������� ��� ��������� ������ �����-
        // �� ������ ����������� �����:
        FileInputStream input =  new FileInputStream(F);

        // ������ ������ File, ������������ ����,
        // � ������� ����������� �����������:
        F = fch.getSelectedFile();

        // �������� ������� ��� ������ ������ �� ������
        // �����, � ������� ����������� �����������:
        FileOutputStream output =  new FileOutputStream(F);

        // ���������� �����������:
        while((res = input.read()) != -1) {
            output.write(res);
        }

        // �������� �������:
        input.close();
        output.close();

        // ����������� ���� � ��������� � ��������
        // ����� �����:
        showMessageDialog(
                null,
                // ����� ��������� � ����:
                "����� ��������� ���\n" + F.getAbsolutePath(),
                // �������� ����:
                "������� ����� �����",
                // ��� �����������:
                INFORMATION_MESSAGE
        );
    }
}
