package Sem6Task1;

import Sem6Task1.library.*;

import java.text.Format;

public class Main {
    public static void main(String[] args) {
        Libraries libraries = new Libraries();
        System.out.println("libraries.bySearchable(\"Пушкин\") = "
                + libraries.bySearchable("Пушкин"));
        Formatter formatter = new JsonFormatter();
        formatter.format(libraries.getBookList().get(0));
        formatter = new HtmlFormatter();
        formatter.format(libraries.getBookList().get(1));
        ElektronBook elektronBook = new ElektronBook("Java полное руководство",
                "Шилдт  Г.",
                200,
                null,
                "txt",
                1024);
        libraries.addBook(elektronBook);
        System.out.println("libraries.getBookList() = " + libraries.getBookList());
    }
}
