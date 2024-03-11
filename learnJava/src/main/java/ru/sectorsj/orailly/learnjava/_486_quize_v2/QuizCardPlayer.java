package ru.sectorsj.orailly.learnjava._486_quize_v2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

class QuizCardPlayer {
    private JTextArea display;
    private JTextArea answer;
    private ArrayList<QuizCard> cardList;
    private QuizCard currentCard;
    private int currentCardIndex;
    private JFrame frame;
    private JButton nextButton;
    private boolean isShowAnswer;


    public static void main(String[] args) {
        QuizCardPlayer reader = new QuizCardPlayer();
        reader.go();
    }

    // TODO Сформировать и вывести GUI на экран
    private void go() {
        frame = new JFrame("Quiz Card Player");
        JPanel mainPanel = new JPanel();

        Font bigFont = new Font("sanserif", Font.BOLD, 24);
        display = new JTextArea(10, 20);
        display.setFont(bigFont);
        display.setLineWrap(true);
        display.setEditable(false);

        JScrollPane qScroller = new JScrollPane(display);
        qScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        qScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        nextButton = new JButton("Show question");
        mainPanel.add(qScroller);
        mainPanel.add(nextButton);
        nextButton.addActionListener(new NextCardListener());

        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenuItem loadMenuItem = new JMenuItem("Load card set");
        loadMenuItem.addActionListener(new OpenMenuListener());
        fileMenu.add(loadMenuItem);
        menuBar.add(fileMenu);
        frame.setJMenuBar(menuBar);
        frame.getContentPane().add(BorderLayout.CENTER, mainPanel);
        frame.setSize(640, 500);
        frame.setVisible(true);
    }

    // TODO Если это вопрос, показываем ответ, иначе показываем следующий вопрос
    //  Устанавливаем флаг для того, что мы видим - вопрос или ответ
    class NextCardListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if (isShowAnswer){
                // Показываем ответ, так как вопрос уже увиден
                display.setText(currentCard.getAnswer());
                nextButton.setText("Next Card");
                isShowAnswer = false;
            } else {
                // Показываем следующий вопрос
                if (currentCardIndex < cardList.size()){
                    showNextCard();
                } else {
                    // Больше карточек нет!
                    display.setText("That was last card");
                    nextButton.setEnabled(false);
                }
            }
        }
    }

    // TODO Вызываем диалоговое окно, позволяющее пользователю выбирать, какой набор карточек открыть
    class OpenMenuListener implements ActionListener{
        String currentDirectory = "D:\\filesEvgeniy\\projects\\mycoding\\java\\books\\learnJava\\src\\main\\resources\\_478_quiz";

        @Override
        public void actionPerformed(ActionEvent e) {
            JFileChooser fileOpen = new JFileChooser(currentDirectory);
            fileOpen.showOpenDialog(frame);
            loadFile(fileOpen.getSelectedFile());
        }
    }

    // TODO Создать ArrayList с карточками, считывая их из текстового файла,
    //  вызванного из обработчика событий класса OpenMenuListener,
    //  прочитать файл по одной строке за один раз
    //  и вызвать метод makeCard() для создания новой карточки из строки.
    //  Одна строка в файле должна содержать вопрос и ответ, разделенные символом - /
    private void loadFile(File file){
        cardList = new ArrayList<QuizCard>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = null;
            while ((line = reader.readLine()) != null){
                makeCard(line);
            }
            reader.close();
        } catch (Exception ex){
            System.out.println("couldn't read the card file");
            ex.printStackTrace();
        }
        showNextCard();
    }

    // TODO Вызвать метод loadFile().
    //  Брать строку из текстового файла, делить ее на 2е части - вопрос и ответ,
    //  и создать новый объект QuizCard.
    //  Добавить его в ArrayList с помощью CardList.
    private void makeCard(String lineToParse){
        String[] result = lineToParse.split("/");
        QuizCard card = new QuizCard(result[0], result[1]);
        cardList.add(card);
        System.out.println("made a card");
    }
    private void showNextCard() {
        currentCard = cardList.get(currentCardIndex);
        currentCardIndex++;
        display.setText(currentCard.getQuestion());
        nextButton.setText("Show Answer");
        isShowAnswer = true;
    }
}
