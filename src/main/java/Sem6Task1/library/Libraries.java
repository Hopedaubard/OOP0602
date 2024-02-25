package Sem6Task1.library;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Libraries implements Searchable, LibraryManager {
    public List<Book> getBookList() {
        return bookList;
    }

    private List<Book> bookList;

    public Libraries() {
        bookList = toFullBook();
    }

    private List<Book> toFullBook() {
        List<Book> result = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            result.add(new Book(
                    "Метель",
                    "Пушкин А. С.",
                    new Random().nextInt(100),
                    new BookGenre("Любовный роман")));
        }
        return result;
    }

    @Override
    public List<Book> bySearchable(String byAuthor) {
        List<Book> result = new ArrayList<>();
//        for (int i = 0; i < bookList.size(); i++) {
        for (Book book : bookList) {
            if (book.getAuthor().contains(byAuthor)) {
                result.add(book);
            }

        }
        return result;
    }


    @Override
    public void addBook(Book book) {
        bookList.add(book);
    }
}
