package ru.sectorsj._563_preferences;

import java.awt.EventQueue;
import java.awt.event.*;
import java.io.*;
import java.util.prefs.*;
import javax.swing.*;

/**
 * В этой программе проверяются глобальные параметры настройки.
 * В ней запоминаются положение и размеры фрейма,
 * а также последний выбранный файл.
 */
public class ImageViewer {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            var frame = new ImageViewerFrame();
            frame.setTitle("ImageViewer");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}

/**
 * Средство просмотра изображений,
 * восстанавливающее положение, размеры и просматриваемое изображение
 * из пользовательских глобальных параметров настройки и
 * обновляющее эти параметры по завершении работы
 */
class ImageViewerFrame extends JFrame {
    private static final int DEFAULT_WIDTH = 300;
    private static final int DEFAULT_HEIGHT = 200;
    private String image;

    public ImageViewerFrame() {
        Preferences root = Preferences.userRoot();
     // Preferences node = root.node("/com/horstmann/corejava/ImageViewer");
        Preferences node = root.node("/ru/sectorsj/_563_preferences/ImageViewer");

        // получить положение, размеры и заглавие из свойств
        int left = node.getInt("left", 0);
        int top = node.getInt("top", 0);
        int width = node.getInt("width", DEFAULT_WIDTH);
        int height = node.getInt("height", DEFAULT_HEIGHT);
        setBounds(left, top, width, height);
        image = node.get("image", null);
        var label = new JLabel();
        if (image != null) {
            label.setIcon(new ImageIcon(image));
        }
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent event) {
                node.putInt("left", getX());
                node.putInt("top", getY());
                node.putInt("width", getWidth());
                node.putInt("height", getHeight());
                if (image != null) {
                    node.put("image", image);
                }
            }
        });
        // воспользоваться меткой для воспроизведения изображений
        add(label);

        // установить селектор файлов (file chooser)
        var chooser = new JFileChooser();
        chooser.setCurrentDirectory(new File("."));

        // установить строку меню (menu bar)
        var menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        var menu = new JMenu("Файл");
        menuBar.add(menu);

        var openItem = new JMenuItem("Открыть");
        menu.add(openItem);
        openItem.addActionListener(event -> {

            // отобразить диалоговое окно селектора файлов
            int result = chooser.showOpenDialog(null);

            // если файл выбран, установить его в виде пиктограммы метки
            if (result == JFileChooser.APPROVE_OPTION) {
                image = chooser.getSelectedFile().getPath();
                label.setIcon(new ImageIcon(image));
            }
        });

        var exitItem = new JMenuItem("Выход");
        menu.add(exitItem);
        exitItem.addActionListener(event -> System.exit(0));
    }
}
