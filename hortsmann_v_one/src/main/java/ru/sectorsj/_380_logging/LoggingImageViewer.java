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
        if (System.getProperty(
                "java.util.ligging.config.class") == null
                && System.getProperty(
                        "java.util.logging.config.file") == null) {
            try {
                Logger.getLogger("ru.sectorsj._380_logging")
                        .setLevel(Level.ALL);
                final int LOG_ROTATION_COUNT = 10;
                var handler = new FileHandler(
                        "%h/LoggingImageViewer.log", 0, LOG_ROTATION_COUNT);
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
