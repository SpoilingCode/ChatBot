package bot;

import answersstorage.englishanswers.StorageEnglishAnswers;
import answersstorage.russiananswers.StorageRussianAnswers;

import java.util.Map;
import java.util.Random;

/**
 * Class for realize bot responses in chat */
public class ChatBot {
    private String botName = ChatBot.class.getName();
    private Random random;
    private StorageEnglishAnswers storageEnglishAnswers;
    private StorageRussianAnswers storageRussianAnswers;
    Map<String, String> answersFromEnglishStorage;
    Map<String, String> answersFromRussianStorage;

    public ChatBot() {
        this.random = new Random();
        this.storageRussianAnswers = new StorageRussianAnswers();
        this.storageEnglishAnswers = new StorageEnglishAnswers();
        this.answersFromEnglishStorage = storageEnglishAnswers.getAnswersInEnglish();
        answersFromRussianStorage = storageRussianAnswers.getAnswersInRussian();
    }

    public String talk(String message){
        String answer;
        if(isQuestion(message)) {
            if (isFoundInEnglishStorage(answersFromEnglishStorage, message)) {

                answer = getAnswerFromStorage(answersFromEnglishStorage, message);

            } else if (isFoundInRussianStorage(answersFromRussianStorage, message)) {

                answer = getAnswerFromStorage(answersFromRussianStorage, message);

            } else {
                answer = "Незнаю";
            }

        } else {

               answer = (isFoundInEnglishStorage(message)) ? st : ;
        }
        return answer;
    }

    public String getAnswerFromStorage(Map<String, String>  storageAnswers, String message){
        String key;
        String answer;

        for (Map.Entry<String, String> entry : storageAnswers.entrySet()) {
            key = entry.getKey();

            if(isFoundAnswer(message, key)){
                answer = entry.getValue();
                return  answer;
            }

        }
        answer = null;
        return answer;
    }

    public boolean isFoundAnswer(String message, String key){
        String messageWithoutSpaces = message.trim();
        return messageWithoutSpaces.toLowerCase()
                                   .equals(key);
    }

    public boolean isQuestion(String message){
       return message.trim().endsWith("?");
    }

    public boolean isFoundInEnglishStorage(Map<String, String>  answersFromEnglishStorage, String message){
        return getAnswerFromStorage(answersFromEnglishStorage, message) != null;
    }

    public boolean isFoundInRussianStorage(Map<String, String>  answersFromRussianStorage, String message){
        return getAnswerFromStorage(answersFromRussianStorage, message) != null;
    }
}
