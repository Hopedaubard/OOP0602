package Sem6Task1.library;

public class ElektronBook extends Book{
    private String formatBook;
    private Integer size;

    public ElektronBook(String title, String author, int pagesQuantity, BookGenre bookGenre, String formatBook, Integer size) {
        super(title, author, pagesQuantity, bookGenre);
        this.formatBook = formatBook;
        this.size = size;
    }
}
