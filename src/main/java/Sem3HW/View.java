package Sem3HW;

import java.util.Scanner;

public class View {
    public void gameChooser () {
        Scanner scan = new Scanner(System.in);
        System.out.println("Выберите игру: \n" +
                 "1 - Цифры \n" +
                "2 - Русские буквы \n" +
                "3 - Английские буквы");

        AbstractGame ag = new NumberGame();
        int sizeOfWord = 4;
        ag.start(sizeOfWord, 3);
        System.out.println("Введите " + sizeOfWord + "-значное число...");
        Scanner value = new Scanner(System.in);
        while (ag.getGameStatus().equals(GameStatus.START)){
            Answer answer = ag.inputValue(value.nextLine());
            System.out.println(answer);
        }
        if (ag.getGameStatus().equals(GameStatus.WIN)){
            System.out.println("Вы победили!");
        } else if (ag.getGameStatus().equals(GameStatus.LOSE)) {
            System.out.println("Вы проиграли...");
        }
        else {
            System.out.println("Неопознанный статус...");
        }
    }
    public void numbers () {
        AbstractGame ag = new NumberGame();
        int sizeOfWord = 4;
        ag.start(sizeOfWord, 3);
        System.out.println("Введите " + sizeOfWord + "-значное число...");
        Scanner value = new Scanner(System.in);
        while (ag.getGameStatus().equals(GameStatus.START)){
            Answer answer = ag.inputValue(value.nextLine());
            System.out.println(answer);
        }
        if (ag.getGameStatus().equals(GameStatus.WIN)){
            System.out.println("Вы победили!");
        } else if (ag.getGameStatus().equals(GameStatus.LOSE)) {
            System.out.println("Вы проиграли...");
        }
        else {
            System.out.println("Неопознанный статус...");
        }
    }
    public void enAlphabet () {
        AbstractGame ag = new EnglishCharGame();
        int sizeOfWord = 4;
        ag.start(sizeOfWord, 3);
        System.out.println("Введите " + sizeOfWord + "-значное слово на латинице...");
        Scanner value = new Scanner(System.in);
        while (ag.getGameStatus().equals(GameStatus.START)){
            Answer answer = ag.inputValue(value.nextLine());
            System.out.println(answer);
        }
        if (ag.getGameStatus().equals(GameStatus.WIN)){
            System.out.println("Вы победили!");
        } else if (ag.getGameStatus().equals(GameStatus.LOSE)) {
            System.out.println("Вы проиграли...");
        }
        else {
            System.out.println("Неопознанный статус...");
        }
    }
}
