package Sem2HW;

public class Cat extends AbstractEntity {
    private final int runDistanceLimit = 300;
    private final double jumpHeigthLimit = 2;

    public Cat(String name, int age) {
        super(name, age);
    }
}
