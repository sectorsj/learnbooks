package ru.sectorsj._380_logging;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.logging.*;
import javax.swing.*;

/**
 В этой программе регистрируются какие-то события
 */
public class LoggingImageViewer {
    public static void main(String[] args) {
        if (System.getProperty("java.util.logging.config.class") == null
                && System.getProperty("java.util.logging.config.file") == null) {
            try {
                Logger.getLogger("ru.sectorsj._380_logging").setLevel(Level.ALL);
                final int LOG_ROTATION_COUNT = 10;
                var handler = new FileHandler("%h/LoggingImageViewer.log", 0, LOG_ROTATION_COUNT);
                Logger.getLogger("ru.sectorsj._380_logging").addHandler(handler);
            } catch (IOException e) {
                Logger.getLogger("ru.sectorsj._380_logging")
                        .log(Level.SEVERE, "Не могу создать файл журнала обработчика", e);
            }
        }
        EventQueue.invokeLater(() ->
        {
            var windowHandler = new WindowHandler();
            windowHandler.setLevel(Level.ALL);
            Logger.getLogger("ru.sectorsj._380_logging").addHandler(windowHandler);

            var frame = new ImageViewerFrame();
            frame.setTitle("LoggingImageViewer");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            Logger.getLogger("ru.sectorsj._380_logging").fine("Фрейм отображается");
            frame.setVisible(true);
        });
    }
}

class ImageViewerFrame extends JFrame {
    private static final int DEFAULT_WIDTH = 300;
    private static final int DEFAULT_HEIGHT = 400;
    private JLabel label;
    private static Logger logger = Logger.getLogger("ru.sectorsj._380_logging");

    public ImageViewerFrame() {
        logger.entering("ImageViewerFrame", "<init>");
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

        // установить строку меню
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu menu = new JMenu("File");
        menuBar.add(menu);

        JMenuItem openItem = new JMenuItem("Open");
        menu.add(openItem);
        openItem.addActionListener(new FileOpenListener());

        JMenuItem exitItem = new JMenuItem("Exit");
        menu.add(exitItem);

        exitItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                logger.fine("Инициирован выход из программы.");
                System.exit(0);
            }
        });

        // Использовать метку для обозначения изображений
        label = new JLabel();
        add(label);
        logger.exiting("ImageViewerFrame", "<init>");
    }

    private class FileOpenListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            logger.entering("ImageViewerFrame.FileOpenListener", "actionPerformed", event);

            // Установить селектор файлов
            JFileChooser chooser = new JFileChooser();
            chooser.setCurrentDirectory(new File("."));

            // Принять все файлы с расширением ".gif"
            chooser.setFileFilter(new javax.swing.filechooser.FileFilter(){
                public boolean accept (File f) {
                    return f.getName().toLowerCase().endsWith(".gif") || f.isDirectory();
                }

                @Override
                public String getDescription() {
                    return "GIF Images";
                }
            });

            // Показываем диалоговое окно селектора файлов
            int r = chooser.showOpenDialog(ImageViewerFrame.this);

            // Если файл изображения подходит, выбрать его в качестве пиктограммы для метки
            if (r == JFileChooser.APPROVE_OPTION){
                String name = chooser.getSelectedFile().getPath();
                logger.log(Level.FINE, "Чтение файла {0}", name);
                label.setIcon(new ImageIcon(name));
            } else {
                logger.fine("Диалог открытия файла отменен.");
            }
            logger.exiting("ImageViewerFrame.FileListener", "actionPerformed");
        }
    }
}

/**
 Обработчик для отображения протокольных записей в окне
 */
class WindowHandler extends StreamHandler {
    private JFrame frame;

    public WindowHandler() {
        frame = new JFrame();
        var output = new JTextArea();
        output.setEditable(false);
        frame.setSize(600, 200);
        frame.add(new JScrollPane(output));
        frame.setFocusableWindowState(false);
        frame.setVisible(true);
        setOutputStream(new OutputStream() {
            @Override
            public void write(int b) {}


            public void write(byte[] b, int off, int len) {
                output.append(new String(b, off, len));
            }
        });
    }

    public void publish(LogRecord record) {
        if (!frame.isVisible()) return;
        super.publish(record);
        flush();
    }
}