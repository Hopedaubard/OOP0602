package Sem6Task1.library;

public class JsonFormatter implements Formatter {
    @Override
    public void format(Book book) {
        System.out.println("Книга " + book.getTitle() + " переведена в формат .json");
    }
}
