package answersstorage.englishanswers;

import java.util.ArrayList;
import java.util.List;

public class StorageEnglishQuestions {
    private List<String> englishnQuestions;

    public StorageEnglishQuestions() {
        englishnQuestions = new ArrayList<String>(){{
            add("What are you doing?");
            add("How are you feeling?");
            add("how are you?");
            add("How was your day?");
            add("What's new?");
            add("What are you so keen on??");
            add("What do you like?");
        }};
    }
}
