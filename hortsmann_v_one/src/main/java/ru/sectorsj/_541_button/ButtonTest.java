package ru.sectorsj._541_button;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Фрейм с панелью экранных кнопок
 */
public class ButtonTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            var frame = new ButtonFrame();
            frame.setTitle("Button Test");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}

class ButtonFrame extends JFrame {
    public ButtonFrame() {
        add(new ButtonsComponent());
        pack();
        setLocationRelativeTo(null);
    }
}

class ButtonsComponent extends JComponent {
    private JPanel buttonPanel;
    private static final int DEFAULT_WIDTH = 300;
    private static final int DEFAULT_HEIGHT = 200;

    public ButtonsComponent() {
        buttonPanel = new JPanel();
        // создаем кнопки
        var yellowButton = new JButton("Yellow");
        var blueButton = new JButton("Blue");
        var redButton = new JButton("Red");

        // добавляем панель на компонент
        setLayout(new BorderLayout()); // Устанавливаем компоновщик для ButtonsComponent
        add(buttonPanel, BorderLayout.CENTER); // Добавляем кнопку в центр

        // добавляем кнопки на Кнопочную панель
        buttonPanel.add(yellowButton);
        buttonPanel.add(blueButton);
        buttonPanel.add(redButton);

        // добавляем панель на фрейм
        add(buttonPanel);

        // добавляем события кнопок
        var yellowAction = new ColorAction(Color.YELLOW);
        var blueAction = new ColorAction(Color.BLUE);
        var redAction = new ColorAction(Color.RED);

        // добавляем ассоциацию событий кнопок с кнопками
        yellowButton.addActionListener(yellowAction);
        blueButton.addActionListener(blueAction);
        redButton.addActionListener(redAction);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
    }

    public Dimension getPreferredSize() {
        return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT);
    }

    private class ColorAction implements ActionListener {

        private Color backgroundColor;

        public ColorAction(Color color) {
            backgroundColor = color;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            buttonPanel.setBackground(backgroundColor);
        }
    }
}