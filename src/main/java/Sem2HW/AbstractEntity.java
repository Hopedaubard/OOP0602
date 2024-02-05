package Sem2HW;

public abstract class AbstractEntity {
    private String name;
    private int age;
    private int runDistanceLimit;
    private double jumpHeigthLimit;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getRunDistanceLimit() {
        return runDistanceLimit;
    }

    public double getJumpHeigthLimit() {
        return jumpHeigthLimit;
    }

    public AbstractEntity(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void toRun(RunningTrack track){
        if (track.getLength() > runDistanceLimit){
            System.out.println(name + " не может пробежать!");
        } else {
            System.out.println(name + " пробежал " + track.getLength() + " метров");
        }
    }
    public void toJump(JumpWall wall){
        if (wall.getWallHeigth() > jumpHeigthLimit){
            System.out.println(name + " не может прыгнуть!");
        } else {
            System.out.println(name + " прыгнул " + wall.getWallHeigth() + " метров");
        }
    };

}
