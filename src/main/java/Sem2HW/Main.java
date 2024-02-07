package Sem2HW;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        RunningTrack runningTrack = new RunningTrack(random.nextInt(1, 5));
        JumpWall jumpWall = new JumpWall(random.nextDouble(3));
        List<AbstractEntity> participantArray = new ArrayList<>(Arrays.asList(
                new Cat("Rick", 5, 300, 2),
                new Robot("Bot1", 1, 1000, 1.5),
                new Human("Peter", 30, 500, 1)
        ));
        System.out.println("participantArray.get(0).getJumpHeigthLimit() = "
                + participantArray.get(0).getJumpHeigthLimit());

        List<Obstacled> obstacles = new ArrayList(Arrays.asList(
                runningTrack, jumpWall
        ));
        for (AbstractEntity member : participantArray) {
            for (Obstacled obstacleComp : obstacles) {
                if (obstacleComp.equals(jumpWall))
                    member.toJump((JumpWall) obstacleComp);
                if (obstacleComp.equals(runningTrack)) {
                    member.toRun((RunningTrack) obstacleComp);
                }
            }
        }
    }
}


