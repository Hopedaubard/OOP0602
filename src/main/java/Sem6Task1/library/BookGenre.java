package Sem6Task1.library;

public class BookGenre implements Genre {
    private String name;


    @Override
    public String getGenre() {
        return name;
    }
}
