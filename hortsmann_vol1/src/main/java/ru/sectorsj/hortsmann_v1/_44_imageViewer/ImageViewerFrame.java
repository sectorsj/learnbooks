package ru.sectorsj.hortsmann_v1._44_imageViewer;

import javax.swing.*;
import java.io.File;

class ImageViewerFrame extends JFrame {
    private static final int DEFAULT_WIDTH = 300;
    private static final int DEFAULT_HEIGHT = 400;

    public ImageViewerFrame() {
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

        // Использовать метку для вывода изображения на экран
        var label = new JLabel();
        add(label);

        // Установить селектор файлов
        var chooser = new JFileChooser();
        chooser.setCurrentDirectory(new File("."));

        // Установить стоку меню
        var menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        var menu = new JMenu("File");
        menuBar.add(menu);

        var openItem = new JMenuItem("Open");
        menu.add(openItem);
        openItem.addActionListener(event ->{
            // Отобразить диалоговое окно селектора файлов
            int result = chooser.showOpenDialog(null);

            // Если файл выбран, задать его в качестве пиктограммы для метки
            if (result == JFileChooser.APPROVE_OPTION){
                String name = chooser.getSelectedFile().getPath();
                label.setIcon(new ImageIcon(name));
            }
        });

        var exitItem = new JMenuItem("Exit");
        menu.add(exitItem);
        exitItem.addActionListener(event -> System.exit(0));
    }
}
