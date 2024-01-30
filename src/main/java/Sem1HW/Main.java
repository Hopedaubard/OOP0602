package Sem1HW;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Product tea1 = new Product("Noorie", 20, 4.3);
        Product coffie1 = new Product("Egoiste", 40, 4.7);
        Product chicken1 = new Product("Cipa", 80, 3.6);
        Market market1 = new Market("4etvero4ka");
        market1.addProductToStorage(tea1);
        market1.addProductToStorage(coffie1);
        Category category1 = new Category("Meat", new Product[10]);
        Category category2 = new Category("Drinks", new Product[10]);
        Basket basket1 = new Basket(new ArrayList[]{});
        Basket basket2 = new Basket(new ArrayList[]{});
        User user1 = new User(basket1);
        User user2 = new User(basket2);
        System.out.println(market1.getStorageCatalogue());
        user1.buyTheProduct(market1, tea1);
        System.out.println(user1.getBasket());
        System.out.println(market1.getStorageCatalogue());
    }
}
