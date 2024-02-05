package Sem2HW;

public class Human extends AbstractEntity{
    private final int runDistanceLimit = 500;
    private final double jumpHeigthLimit = 1.2;
    public Human(String name, int age) {
        super(name, age);
    }
}
