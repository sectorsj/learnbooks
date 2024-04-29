package ru.sectorsj._18_files_and_cmd_arguments._665_get_money_demo;

import static javax.swing.JOptionPane.*;

// ������� �����
class GetMoneyDemo {
    // ������� �����
    public static void main(String[] args) {
        // ��� ���������:
        String name;
        // ��������� ����� ������:
        double m;
        // ���������� ������:
        double r;
        // ����� ���������� ������:
        int t;
        // �������� ����� �� ������:
        double val;

        // �������������� ���:
        try {
            // ����������� ����� ���������:
            name = args[0] + " " + args[1];
            // ����������� ��������� ����� ������:
            m = Double.parseDouble(args[2]);
            // ����������� ���������� ������:
            r = Double.parseDouble(args[3]);
            // ����������� ��������� �������:
            t = Integer.parseInt(args[4]);

            // ���������� �������� �����.
            // ��������� ��������:
            val = m;
            // "���������� ���������":
            for (int k = 0; k <= t; k++) {
                val *= (1 + r / 100);
            }
            // "���������" ����������:
            val = ((int)(100 * val)) / 100.0;

            // ������������ ������ ��� ����������� ���������
            // � ���������� ����
            String txt = "���:  " + name + "\n";
            txt += "�����:  " + m + "\n";
            txt += "������:  " + r + "\n";
            txt += "�����:  " + t + "\n";
            txt += "����:  " + val;
            // ����������� ���� � ����������:
            showMessageDialog(null,
                    // ����� ���������
                    txt,
                    //�������� ����:
                    "�������� ����� �� ��������",
                    // ��� ����:
                    INFORMATION_MESSAGE
            );
        }
        // ��������� ����������:
        catch(Exception e) {
            // ����������� ���������:
            showMessageDialog(null,
                    // ����� ���������:
                    "������� ������� ���������!\n" + e,
                    //�������� ����:
                    "������",
                    // ��� ����:
                    ERROR_MESSAGE
            );
        }
    }
}
