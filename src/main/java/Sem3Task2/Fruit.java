package Sem3Task2;

public enum Fruit {
    APPLE("Яблоко"),
    PINAPPLE("Ананас"),
    ORANGE("Апельсин"),
    MANDARINE("Мандарин"),
    BANANA("Банан");
    private final String fruitName;

    Fruit(String fruitName) {
        this.fruitName = fruitName;
    }

    public String getFruitName() {
        return fruitName;
    }
}
