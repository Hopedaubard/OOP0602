package Sem3HW;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RussianCharGame extends AbstractGame{
    @Override
    List<String> generateCharList() {
        return new ArrayList<>(Arrays.asList("а", "б", "в", "г", "д", "е", "ж", "з", "и", "к", "л", "м", "н",
                "о", "п", "р", "с", "т", "У", "ф", "х", "ц", "ч", "ш", "щ", "ь", "ы", "ъ", "э", "ю", "я"));
    }
}
