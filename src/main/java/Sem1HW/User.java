package Sem1HW;

import java.util.ArrayList;

public class User {
    private String login;
    private String password;
    ArrayList<Product> basket;

    public User(Basket basket) {
//        this.login = login;
//        this.password = password;
        this.basket = new ArrayList<Product>(0);
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList getBasket() {
        return basket;
    }

    public void setBasket(ArrayList basket) {
        this.basket = basket;
    }
    public void buyTheProduct(Market market, Product product) {
       if (market.getStorage().contains(product)){
           market.getStorage().remove(product);
           this.basket.add(product);
       }
    }
}
