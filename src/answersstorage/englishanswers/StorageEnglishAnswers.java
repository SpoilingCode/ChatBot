package answersstorage.englishanswers;

import java.util.HashMap;
import java.util.Map;

public class StorageEnglishAnswers {
    private Map<String, String> answersInEnglish;

    public StorageEnglishAnswers() {
        answersInEnglish = new HashMap<String, String>(){{
            put("hello","Hello, at last someone has written, and that is boring.");
            put("hi", "Hi, at last someone has written, and that is boring.");
            put("howareyou","I am fine and you?");
            put("who","Try to guess.");
            put("name","My name is droid C-3PO.");
            put("whattime","I don't know.");
            put("whatdoyoudoing", "With you I communicate.");
            put("whatdoyoulike","Like talking.");
            put("yes", "I'm glad that you agree with me.");
            put("bye", "Goodbye, come back rather.");
        }};
    }

    public Map<String, String> getAnswersInEnglish() {
        return answersInEnglish;
    }


}
