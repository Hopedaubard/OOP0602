package Sem2HW;

public class JumpWall implements Obstacled{
    private double wallHeigth;

    public JumpWall(double wallHeigth) {
        this.wallHeigth = wallHeigth;
    }

    public double getWallHeigth() {
        return wallHeigth;
    }

    public void setWallHeigth(double wallHeigth) {
        this.wallHeigth = wallHeigth;
    }
}
