package ru.sectorsj._533_font;

import javax.swing.*;
import java.awt.*;
import java.awt.font.FontRenderContext;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

public class FontTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            var frame = new FontFrame();
            frame.setTitle("Font Test");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
/**
 * Фрейм с компонентом текстового сообщения
 */
class FontFrame extends JFrame {
    public FontFrame() {
        add(new FontComponent());
        pack();
    }
}

/**
 * Компонент, отображающий текстовое сообщение, выровненное по центру в прямоугольной рамке
 */
class FontComponent extends JComponent {
    private static final int DEFAULT_WIDTH = 300;
    private static final int DEFAULT_HEIGHT = 200;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        var g2 = (Graphics2D) g;
        var message = "Hello World!";
        var f = new Font("Serif", Font.BOLD, 32);
        g2.setFont(f);

        // определяем размеры текстового сообщения
        FontRenderContext context = g2.getFontRenderContext();
        Rectangle2D bounds = f.getStringBounds(message, context);

        // определяем координаты (х, у) верхнего левого угла текста
        double x = (getWidth() - bounds.getWidth()) / 2;
        double y = (getHeight() - bounds.getHeight()) / 2;

        // складываем "подъем" с координатой "у", чтобы достичь "базовой линии"
        double ascent = -bounds.getY();
        double baseY = y + ascent;

        // воспроизводим текстовое сообщение
        g2.drawString(message, (int) x, (int) baseY);
        g2.setPaint(Color.LIGHT_GRAY);

        // рисуем "базовую линию"
        g2.draw(new Line2D.Double(x, baseY, x + bounds.getWidth(), baseY));

        // рисуем "ограничивающий прямоугольник"
        var rect = new Rectangle2D.Double(x, y, bounds.getWidth(), bounds.getHeight());
        g2.draw(rect);
    }

    public Dimension getPreferredSize() {
        return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT);
    }
}