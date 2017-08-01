package answersstorage.russiananswers;

import java.util.HashMap;
import java.util.Map;

public class StorageRussianAnswers {
    private Map<String, String> answersInRussian;

    public StorageRussianAnswers() {
        answersInRussian = new HashMap<String, String>(){{
            put("привет","Привет, наконец-то кто-то написал, а то скучно.");
            put("здарова", "Здарова, наконец-то кто-то написал, а то скучно.");
            put("здравсвтуй", "Здравствуй странник.");
            put("какдела","У меня хорошо, а у тебя?");
            put("кто","Попробуй угадать.");
            put("зовут","Меня зовут дроид C-3PO.");
            put("имя", "У меня много имен.");
            put("чтоделаешь", "Общаюсь с тобой.");
            put("чтотебенравится","Люблю общаться.");
            put("да", "Я рад что ты согласен.");
            put("пока", "Пока, возвращайся скорее.");
        }};
    }

    public Map<String, String> getAnswersInRussian() {
        return answersInRussian;
    }
}
