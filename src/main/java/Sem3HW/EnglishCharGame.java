package Sem3HW;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class EnglishCharGame extends AbstractGame{

    @Override
    List<String> generateCharList() {
        return new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m",
                "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"));
    }
}
