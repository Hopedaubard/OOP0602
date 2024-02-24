package Sem6Task1.library;

import java.util.ArrayList;
import java.util.List;

public class Libraries implements Searchable {
    public List<Book> bookList;

    @Override
    public List<Book> bySearchable(String byAuthor) {
        List<Book> result = new ArrayList<>();
//        for (int i = 0; i < bookList.size(); i++) {
        for (Book book : bookList) {
            if (book.getAuthor().equals(byAuthor)) {
                result.add(book);
            }

        }
        return result;
    }
}
