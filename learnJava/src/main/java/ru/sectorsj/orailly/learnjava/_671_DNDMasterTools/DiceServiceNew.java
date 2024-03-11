package ru.sectorsj.orailly.learnjava._671_DNDMasterTools;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DiceServiceNew implements Service {

    JPanel panel;       // Панель, на которой будут отображаться кубики
    JButton rollButton; // Кнопка для броска кубиков

    @Override
    public JPanel getGuiPanel() {
        panel = new JPanel();                                   // Создаем новую панель
        rollButton = new JButton("Roll 'em!");             // Создаем кнопку с названием "Roll 'em!"
        rollButton.addActionListener(new RollEmListener());     // Добавляем слушателя событий на кнопку
        panel.add(rollButton);                                  // Добавляем кнопку на панель
        return panel;                                           // Возвращаем панель с кнопкой
    }

    private class RollEmListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int numOfDice = Integer.parseInt(JOptionPane.showInputDialog("Enter number of dice to roll:")); // Запрашиваем у пользователя количество кубиков для броска

            panel.removeAll();                                                          // Удаляем все компоненты с панели
            panel.setLayout(new GridLayout(1, numOfDice, 10, 10));    // Устанавливаем компоновщик сетки для панели с отступами между кубиками

            for (int i = 0; i < numOfDice; i++) {   // Цикл для создания и добавления кубиков на панель
                panel.add(new DicePanel());         // Добавляем новый кубик на панель
            }
            panel.revalidate();                     // Пересчитываем компоновку панели
            panel.repaint();                        // Перерисовываем панель
        }
    }

    private class DicePanel extends JPanel {
        private final int SIDE_LENGTH = 70; // Размер кубика
        private final int DOT_SIZE = 14;    // Размер точек
        private int value;                  // Значение кубика

        public DicePanel() {
            setPreferredSize(new Dimension(SIDE_LENGTH, SIDE_LENGTH));  // Устанавливаем предпочтительные размеры кубика
            setBackground(Color.WHITE);                                 // Устанавливаем белый фон для кубика
            roll();                                                     // Бросаем кубик
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);    // Вызываем метод родительского класса для отрисовки компонента
            Graphics2D g2d = (Graphics2D) g;    // Приводим графический контекст к типу Graphics2D

            g2d.setColor(Color.BLACK);  // Устанавливаем цвет графики на черный
            g2d.drawRect(0, 0, SIDE_LENGTH, SIDE_LENGTH);   // Рисуем рамку вокруг кубика

            switch (value) {    // Определяем, какие точки рисовать на кубике в зависимости от значения
                case 1: // Если значение 1
                    drawCenteredCircle(g2d, SIDE_LENGTH / 2, SIDE_LENGTH / 2, DOT_SIZE);            // Рисуем точку по центру кубика
                    break;
                case 2: // Если значение 2
                    drawCenteredCircle(g2d, SIDE_LENGTH / 4, SIDE_LENGTH / 4, DOT_SIZE);            // Рисуем точку в верхнем левом углу
                    drawCenteredCircle(g2d, 3 * SIDE_LENGTH / 4, 3 * SIDE_LENGTH / 4, DOT_SIZE);    // Рисуем точку в нижнем правом углу
                    break;
                case 3: // Если значение 3
                    drawCenteredCircle(g2d, SIDE_LENGTH / 4, SIDE_LENGTH / 4, DOT_SIZE);            // Рисуем точку в верхнем левом углу
                    drawCenteredCircle(g2d, SIDE_LENGTH / 2, SIDE_LENGTH / 2, DOT_SIZE);            // Рисуем точку в центре кубика
                    drawCenteredCircle(g2d, 3 * SIDE_LENGTH / 4, 3 * SIDE_LENGTH / 4, DOT_SIZE);    // Рисуем точку в нижнем правом углу
                    break;
                case 4: // Если значение 4
                    drawCenteredCircle(g2d, SIDE_LENGTH / 4, SIDE_LENGTH / 4, DOT_SIZE);            // Рисуем точку в верхнем левом углу
                    drawCenteredCircle(g2d, 3 * SIDE_LENGTH / 4, SIDE_LENGTH / 4, DOT_SIZE);        // Рисуем точку в верхнем правом углу
                    drawCenteredCircle(g2d, SIDE_LENGTH / 4, 3 * SIDE_LENGTH / 4, DOT_SIZE);        // Рисуем точку в нижнем левом углу
                    drawCenteredCircle(g2d, 3 * SIDE_LENGTH / 4, 3 * SIDE_LENGTH / 4, DOT_SIZE);    // Рисуем точку в нижнем правом углу
                    break;
                case 5: // Если значение 5
                    drawCenteredCircle(g2d, SIDE_LENGTH / 4, SIDE_LENGTH / 4, DOT_SIZE);            // Рисуем точку в верхнем левом углу
                    drawCenteredCircle(g2d, 3 * SIDE_LENGTH / 4, SIDE_LENGTH / 4, DOT_SIZE);        // Рисуем точку в верхнем правом углу
                    drawCenteredCircle(g2d, SIDE_LENGTH / 4, 3 * SIDE_LENGTH / 4, DOT_SIZE);        // Рисуем точку в нижнем левом углу
                    drawCenteredCircle(g2d, 3 * SIDE_LENGTH / 4, 3 * SIDE_LENGTH / 4, DOT_SIZE);    // Рисуем точку в нижнем правом углу
                    drawCenteredCircle(g2d, SIDE_LENGTH / 2, SIDE_LENGTH / 2, DOT_SIZE);            // Рисуем точку по центру кубика
                    break;
                case 6: // Если значение 6
                    drawCenteredCircle(g2d, SIDE_LENGTH / 4, SIDE_LENGTH / 4, DOT_SIZE);            // Рисуем точку в верхнем левом углу
                    drawCenteredCircle(g2d, 3 * SIDE_LENGTH / 4, SIDE_LENGTH / 4, DOT_SIZE);        // Рисуем точку в верхнем правом углу
                    drawCenteredCircle(g2d, SIDE_LENGTH / 4, 3 * SIDE_LENGTH / 4, DOT_SIZE);        // Рисуем точку в нижнем левом углу
                    drawCenteredCircle(g2d, 3 * SIDE_LENGTH / 4, 3 * SIDE_LENGTH / 4, DOT_SIZE);    // Рисуем точку в нижнем правом углу
                    drawCenteredCircle(g2d, SIDE_LENGTH / 4, SIDE_LENGTH / 2, DOT_SIZE);            // Рисуем точку посередине слева
                    drawCenteredCircle(g2d, 3 * SIDE_LENGTH / 4, SIDE_LENGTH / 2, DOT_SIZE);        // Рисуем точку посередине справа
                    break;
            }
        }

        private void drawCenteredCircle(Graphics2D g2d, int x, int y, int r) {
            x = x - (r / 2);            // Перемещаем координату x так, чтобы точка рисовалась с центром в x
            y = y - (r / 2);            // Перемещаем координату y так, чтобы точка рисовалась с центром в y
            g2d.fillOval(x, y, r, r);   // Рисуем точку
        }

        public void roll() {
            value = (int) (Math.random() * 6) + 1;  // Генерируем случайное значение от 1 до 6
        }
    }
}
