package Sem3Task2;

public class Main {
    public static void main(String[] args) {
        Fruit fruit = Fruit.BANANA;
        switch (fruit) {
            case APPLE, PINAPPLE, ORANGE, MANDARINE, BANANA -> System.out.println(fruit.getFruitName());
            default -> System.out.println("Такого фрукта нет!");
        }
    }
}
