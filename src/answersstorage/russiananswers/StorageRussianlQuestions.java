package answersstorage.russiananswers;

import java.util.ArrayList;
import java.util.List;

public class StorageRussianlQuestions {
    private List<String> russianQuestions;

    public StorageRussianlQuestions() {
        russianQuestions = new ArrayList<String>(){{
            add("Что делаешь?");
            add("Как настроение?");
            add("Как дела?");
            add("Как прошел день?");
            add("Что нового?");
            add("Чем увлекаешься?");
            add("Что тебе нравится?");
        }};
    }

    public List<String> getRussianQuestions() {
        return russianQuestions;
    }
}
