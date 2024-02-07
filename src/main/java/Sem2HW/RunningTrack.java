package Sem2HW;

public class RunningTrack implements Obstacled{
    private int length;

    public RunningTrack(int length) {
        this.length = length * 100;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
