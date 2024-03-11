package ru.sectorsj.orailly.learnjava._169_sinkDotCom;

import java.util.ArrayList;

public class DotComBust {
        //DotComBust dcb = new DotComBust();

        private GameHelperNew helper = new GameHelperNew();
        private ArrayList<DotComNew> dotComList = new ArrayList<>();
        private int numOfGuesses = 0;

    public void setUpGame(){
        DotComNew site1 = new DotComNew();
        site1.setName("Pets.com");
        DotComNew site2 = new DotComNew();
        site2.setName("eToys.ru");
        DotComNew site3 = new DotComNew();
        site3.setName("Go2.com");

        dotComList.add(site1);
        dotComList.add(site2);
        dotComList.add(site3);

        System.out.println("Ваша цель - потопить три 'сайта'.");
        System.out.println("Pets.com, eToys.ru, Go2.com");
        System.out.println("Сделайте это за минимальное число ходов");

        for (DotComNew dotComToSet : dotComList) {
            ArrayList<String> newLocation = helper.placeDotCom(3);
            dotComToSet.setLocationCells(newLocation);
        }
    }

    public void startPlaying(){
        while (!dotComList.isEmpty()){
            String userGuess = helper.getUserInput("Введите координаты: ");
            checkUserGuess(userGuess);
        }
        finishGame();
    }

    public void checkUserGuess(String userGuess){
        numOfGuesses++;
        String result = "Мимо";

        for (DotComNew dotComToTest : dotComList) {
            result = dotComToTest.checkYourself(userGuess);
            if (result.equals("Попал")){
                break;
            }
            if (result.equals("Потопил")){
                dotComList.remove(dotComToTest);
                break;
            }
        }
        System.out.println(result);
    }

    public void finishGame(){
        System.out.println("Все сайты ушли ко дну! Ваши акции ничего не стоят.");
        if (numOfGuesses <= 18){
            System.out.println("Это заняло у Вас " + numOfGuesses + " попыток.");
            System.out.println("Вы успели выбраться до того, как Ваши вложенния утонули.");
        } else {
            System.out.println("Это заняло у Вас довольно много времени - " + numOfGuesses + " попыток.");
            System.out.println("Рыбы водят хороводы вокруг Ваших вложений");
        }
    }

    public static void main(String[] args) {
        DotComBust game = new DotComBust();
        game.setUpGame();
        game.startPlaying();
    }
}