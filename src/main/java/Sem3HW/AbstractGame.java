package Sem3HW;

import java.util.List;
import java.util.Random;

public abstract class AbstractGame implements Game {

    abstract List<String> generateCharList();
    private String word;
    Integer tryCount;
    GameStatus gameStatus = GameStatus.INIT;
    Integer restarterTryCounter;

    @Override
    public void start(Integer sizeWord, Integer tryCount) {
        this.word = generateWord(sizeWord);
        this.tryCount = tryCount;
        this.gameStatus = GameStatus.START;
        this.restarterTryCounter = tryCount;
    }

    private String generateWord(Integer sizeWord) {
        List<String> alphabet = generateCharList();
        Random rnd = new Random();
        String result = "";
        for (int i = 0; i < sizeWord; i++) {
            int randomIndex = rnd.nextInt(alphabet.size());
            result += alphabet.get(randomIndex);
            alphabet.remove(randomIndex);
        }
        return result;
    }

    @Override
    public Answer inputValue(String value) {
        if (!getGameStatus().equals(GameStatus.START)){
            throw new RuntimeException("Игра не запущена!");
        }
        int cowCounter = 0;
        int bullCounter = 0;
        for (int i = 0; i < word.length(); i++) {
            if (value.charAt(i) == word.charAt(i)){
                cowCounter++;
                bullCounter++;
            } else if (word.contains(String.valueOf(value.charAt(i)))) {
                cowCounter++;
            }
        }
        tryCount--;
        if (tryCount == 0){
            gameStatus = GameStatus.LOSE;
        }
        if (bullCounter == word.length()){
            gameStatus = GameStatus.WIN;
        }
        if (tryCount < 0){
            tryCount = restarterTryCounter - 1;
        }
        return new Answer(cowCounter, bullCounter, tryCount);
    }

    @Override
    public GameStatus getGameStatus() {
        return gameStatus;
    }
}
