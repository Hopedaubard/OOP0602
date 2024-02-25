package Sem6Task1.library;

public class Book {
    private String title;
    private String author;
    private int pagesQuantity;
    private BookGenre bookGenre;

    public Book(String title, String author, int pagesQuantity, BookGenre bookGenre) {
        this.title = title;
        this.author = author;
        this.pagesQuantity = pagesQuantity;
        this.bookGenre = bookGenre;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPagesQuantity() {
        return pagesQuantity;
    }

    public BookGenre getBookGenre() {
        return bookGenre;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", pagesQuantity=" + pagesQuantity +
                ", bookGenre=" + bookGenre +
                '}' + "\n";
    }
}
