package ru.sectorsj._554_mouse;

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import javax.swing.*;
import java.util.*;


class MouseTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(() ->{
            var frame = new MouseEventFrame();
            frame.setTitle("Mouse Events");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}

class MouseEventFrame extends JFrame {
    public MouseEventFrame() {
        add(new MouseEventComponent());
        pack();
    }
}


/**
 * Компонент для операций с мышью по добавлению и удалению квадратов
 */
class MouseEventComponent extends JComponent {
    private static final int DEFAULT_WIDTH = 300;
    private static final int DEFAULT_HEIGHT = 200;

    private static final int SIDE_LENGTH = 10;
    private ArrayList<Rectangle2D> squares;
    private Rectangle2D current;    // Квадрат, содержащий курсор мыши

    public MouseEventComponent() {
        squares = new ArrayList<>();
        current = null;

        addMouseListener(new MouseHandler());
        addMouseMotionListener(new MouseMotionHandler());
    }

    public Dimension getPreferredSize(){
        return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT);
    }

    public void paintComponent(Graphics g) {
        var g2 = (Graphics2D) g;

        // рисуем все квадраты
        for (Rectangle2D r : squares) {
            g2.draw(r);
        }
    }

    /**
     * Обнаруживает первый квадрат, содержащий заданную точку
     * @param p Точка
     * @return
     */
    public Rectangle2D find(Point2D p) {
        for (Rectangle2D r : squares) {
            if (r.contains(p)) return r;
        }
        return null;
    }

    /**
     * Добавляет квадрат в коллекцию
     * @param p Центр квадрата
     */
    public void add(Point2D p) {
        double x = p.getX();
        double y = p.getY();

        current = new Rectangle2D.Double(
                x - SIDE_LENGTH / 2,
                y - SIDE_LENGTH / 2,
                SIDE_LENGTH,
                SIDE_LENGTH);
        squares.add(current);
        repaint();
    }

    /**
     * Удаляет квадрат из коллекции
     * @param s Квадрат, который нужно удалить
     */
    public void remove(Rectangle2D s) {
        if (s == null) return;
        if (s == current) {
            current = null;
        }
        squares.remove(s);
        repaint();
    }

    private class MouseHandler extends MouseAdapter {
        @Override
        public void mousePressed(MouseEvent event) {

            // Добавить новый квадрат, если курсор находится за пределами квадрата
            current = find(event.getPoint());
            if (current == null) {
                add(event.getPoint());
            }
        }

        @Override
        public void mouseClicked(MouseEvent event) {
            current = find(event.getPoint());

            // Удалить текущий квадрат, если на нем произведен двойной щелчок
            if (current != null && event.getClickCount() >= 2) {
                remove(current);
            }
        }
    }

    public class MouseMotionHandler implements MouseMotionListener {

        @Override
        public void mouseMoved(MouseEvent event) {

            // Задать курсор в виде перекрестья, если он находится внутри квадрата
            if (find(event.getPoint()) == null) {
                setCursor(Cursor.getDefaultCursor());
            } else {
                setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
            }
        }

        @Override
        public void mouseDragged(MouseEvent event) {
            if (current != null) {
                int x = event.getX();
                int y = event.getY();

                // Перетащить текущий квадрат, для центровки его в точке с координатами (x, y)
                current.setFrame(x - SIDE_LENGTH / 2, y - SIDE_LENGTH / 2, SIDE_LENGTH, SIDE_LENGTH);
                repaint();
            }
        }
    }
}
