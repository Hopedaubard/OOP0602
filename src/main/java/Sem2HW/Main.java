package Sem2HW;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Rick", 5);
        System.out.println("cat1.getJumpHeigthLimit() = " + cat1.getJumpHeigthLimit());
        Random random = new Random();
        RunningTrack runningTrack = new RunningTrack(random.nextInt(1, 9) * 100);
        JumpWall jumpWall = new JumpWall(Math.floor(random.nextDouble(3)));
        System.out.println(runningTrack.getLength());
        System.out.println(jumpWall.getWallHeigth());
    }
}
