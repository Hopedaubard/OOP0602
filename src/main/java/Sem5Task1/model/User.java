package Sem5Task1.model;

public abstract class User {
    protected String name;
    protected Integer age;

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}