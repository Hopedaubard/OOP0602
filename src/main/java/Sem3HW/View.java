package Sem3HW;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class View {
    GameChoose gameChoose = GameChoose.NOTHING;
    int gameVariant;
    int saveSize;
    FileWriter fileWriter;
    {
        try {
            fileWriter = new FileWriter("file1.txt",false);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void toUseLoggerWriter(String message){
        try {
            fileWriter.write(message);
            fileWriter.append('\n');
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void playTheGame (){
        gameChooser();
    }
    public AbstractGame toCreateGame(int variant, int size){
        if (variant == 1){
            this.gameChoose = GameChoose.NUM;
        }
        if (variant == 2){
            this.gameChoose = GameChoose.RU;
        }
        if (variant == 3){
            this.gameChoose = GameChoose.EN;
        }
        if (gameChoose == GameChoose.NUM){
            System.out.println("Введите " + size + "-значное число...");
            return new NumberGame();
        }
        if (gameChoose == GameChoose.RU){
            System.out.println("Введите " + size + "-значное слово на кириллице...");
            return new RussianCharGame();
        }
        if (gameChoose == GameChoose.EN){
            System.out.println("Введите " + size + "-значное слово на латинице...");
            return new EnglishCharGame();
        }
        return null;
    }
    private void gameChooser () {
        Scanner scan = new Scanner(System.in);
        int sizeOfWord = 4;
        toUseLoggerWriter("Выбран размер слова: " + sizeOfWord);
        System.out.println("Выберите игру: \n" +
                "1 - Цифры \n" +
                "2 - Русские буквы \n" +
                "3 - Английские буквы");
        int chooseNum = scan.nextInt();
        this.gameVariant = chooseNum;
        this.saveSize = sizeOfWord;
        AbstractGame ag = toCreateGame(chooseNum ,sizeOfWord);
        ag.start(sizeOfWord, 3);
        Scanner value = new Scanner(System.in);
        while (ag.getGameStatus().equals(GameStatus.START)) {
            Answer answer = ag.inputValue(value.nextLine());
            System.out.println(answer);
//        }

            if (ag.getGameStatus().equals(GameStatus.WIN)) {
                System.out.println("Вы победили!");
            }
//            else
                if (ag.getGameStatus().equals(GameStatus.LOSE)) {
                System.out.println("Вы проиграли... \n" +
                        "1 - начать игру заново \n" +
                        "2 - завершить игру");
                Scanner scanner = new Scanner(System.in);
//            int choose = 0;
                if (scanner.nextInt() == 1) {
                    ag.gameStatus = GameStatus.RESTART;
                } else if (scanner.nextInt() == 2) {
                    ag.gameStatus = GameStatus.EXIT;
                }
            }
            if (ag.getGameStatus().equals(GameStatus.RESTART)) {
                System.out.println("Перезапуск игры...");
                toCreateGame(this.gameVariant, this.saveSize);
                ag.gameStatus = GameStatus.START;
            }
            if (ag.getGameStatus().equals(GameStatus.EXIT)) {
                System.out.println("Игра окончена!");
            }
//            else {
//                System.out.println("Неопознанный статус...");
//            }
        }
    }
}

