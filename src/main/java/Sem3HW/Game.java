package Sem3HW;

public interface Game {
//a) Интерфейс взаимодействий Game
//(должны быть описаны сигнатуры методов
//start, inputValue,getGameStatus)
    void start(Integer sizeWord, Integer tryCount);

    Answer inputValue(String value);
    GameStatus getGameStatus();
}
