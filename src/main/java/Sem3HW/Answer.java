package Sem3HW;

public class Answer {
    private int cowCounter;
    private int bullCounter;
    private Integer tryCount;

    public Answer(int cowCounter, int bullCounter, Integer tryCount) {
        this.cowCounter = cowCounter;
        this.bullCounter = bullCounter;
        this.tryCount = tryCount;
    }


    @Override
    public String toString() {
        return cowCounter + " коровы, " + bullCounter + " быка. " + "Осталось попыток " + tryCount;
    }
}
