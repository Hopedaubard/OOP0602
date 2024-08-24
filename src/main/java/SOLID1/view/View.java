package SOLID1.view;

import SOLID1.*;
import SOLID1.model.AbstractGame;

import java.io.IOException;
import java.util.Scanner;

public class View {
    GameChoose gameChoose = GameChoose.NOTHING;
    int gameVariant;
    private int saveSize;
    Logger logger = new Logger();


    //    public void loggerReader(){
//
//    };
    public void playTheGame() throws IOException {
        gameChooser();
    }

    public AbstractGame toCreateGame(int variant, int size) {
        if (variant == 1) {
            this.gameChoose = GameChoose.NUM;
            logger.loggerWriter("Выбран режим с угадыванием чисел");
        }
        if (variant == 2) {
            this.gameChoose = GameChoose.RU;
            logger.loggerWriter("Выбран режим с угадыванием кириллических символов");
        }
        if (variant == 3) {
            this.gameChoose = GameChoose.EN;
            logger.loggerWriter("Выбран режим с угадыванием латинских символов");
        }
        if (gameChoose == GameChoose.NUM) {
            System.out.println("Введите " + size + "-значное число...");
            return new NumberGame();
        }
        if (gameChoose == GameChoose.RU) {
            System.out.println("Введите " + size + "-значное слово на кириллице...");
            return new RussianCharGame();
        }
        if (gameChoose == GameChoose.EN) {
            System.out.println("Введите " + size + "-значное слово на латинице...");
            return new EnglishCharGame();
        }
        return null;
    }

    private void gameChooser() throws IOException {
        Scanner scan = new Scanner(System.in);
        int sizeOfWord = 4;
        logger.loggerWriter("По умолчанию выбран размер строки: " + sizeOfWord);
        System.out.println("Выберите игру: \n" +
                "1 - Цифры \n" +
                "2 - Русские буквы \n" +
                "3 - Английские буквы");
        int chooseNum = scan.nextInt();
        this.gameVariant = chooseNum;
        this.saveSize = sizeOfWord;
        AbstractGame ag = toCreateGame(chooseNum, sizeOfWord);
        ag.start(sizeOfWord, 3);
        logger.loggerWriter("Сгенерировано слово: " + ag.getResult());
        Scanner value = new Scanner(System.in);
        while (ag.getGameStatus().equals(GameStatus.START)) {
            Answer answer = ag.inputValue(value.nextLine());
            System.out.println(answer);
//        }

            if (ag.getGameStatus().equals(GameStatus.WIN)) {
                logger.loggerWriter("Одержана победа с остатком в " + answer.getTryCount() + " попыток!");
                System.out.println("Вы победили!");
            }
//            else
            if (ag.getGameStatus().equals(GameStatus.LOSE)) {
                logger.loggerWriter("Потрачены все попытки...");
                System.out.println("Вы проиграли... \n" +
                        "1 - начать игру заново \n" +
                        "2 - завершить игру");
                Scanner scanner = new Scanner(System.in);
                int chooScan = scanner.nextInt();
                if (chooScan == 1) {
                    ag.gameStatus = GameStatus.RESTART;
                    logger.loggerWriter("Произведён перезапуск игры...");
                } else if (chooScan == 2) {
                    ag.gameStatus = GameStatus.EXIT;
                    System.out.println("Вывести историю игры?" +
                            "\n 1 - да" +
                            "\n 2 - нет");
                    chooScan = scanner.nextInt();
                    if (chooScan == 1) {
                        System.out.println("Выведена история игры: " +
                                "\n **********");
                        logger.getLogger();
                        System.out.println("**********");
                        break;
                    }
                    if (chooScan == 2){
                        System.out.println("**********");
                    }
                }
            }
            if (ag.getGameStatus().equals(GameStatus.RESTART)) {
                System.out.println("Перезапуск игры...");
                toCreateGame(this.gameVariant, this.saveSize);
                ag.gameStatus = GameStatus.START;
                if (ag.getGameStatus().equals(GameStatus.START)) {
                    gameChooser();
                    ag.gameStatus = GameStatus.INIT;
                }
            }
            if (ag.getGameStatus().equals(GameStatus.EXIT)) {
                System.out.println("Игра окончена!");
                break;
            }
//            else {
//                System.out.println("Неопознанный статус...");
//            }
        }
    }
}

