package Sem1HW;

import java.util.ArrayList;
import java.util.Arrays;

public class Market {
    private String name;
    private ArrayList<Product> storage;

    public Market(String name) {
        this.name = name;
        this.storage = new ArrayList<Product>(0);
//        this.storage = storage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Product> getStorage() {
        return this.storage;
    }
    public String getStorageCatalogue() {
        return "Market{" +
                "name='" + name + '\'' +
                ", storage=" + storage.toString()+
                "} \n";
    }

    public void addProductToStorage(Product product) {
        this.storage.add(product);
    }

}
