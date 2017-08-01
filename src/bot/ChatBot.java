package bot;

import answersstorage.englishanswers.StorageEnglishAnswers;
import answersstorage.russiananswers.StorageRussianAnswers;
import answersstorage.russiananswers.StorageRussianlQuestions;

import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 * Class for realize bot responses in chat */
public class ChatBot {
    private final String botName = "Чат-Бот";
    private Random random;
    private StorageEnglishAnswers storageEnglishAnswers;
    private StorageRussianAnswers storageRussianAnswers;
    Map<String, String> answersFromEnglishStorage;
    Map<String, String> answersFromRussianStorage;
    private List<String> russianQuestions;
    private StorageRussianlQuestions storageRussianlQuestions;

    public ChatBot() {
        this.random = new Random();
        this.storageRussianAnswers = new StorageRussianAnswers();
        this.storageEnglishAnswers = new StorageEnglishAnswers();
        this.answersFromEnglishStorage = storageEnglishAnswers.getAnswersInEnglish();
        this.storageRussianlQuestions = new StorageRussianlQuestions();
        this.russianQuestions = storageRussianlQuestions.getRussianQuestions();
        this.answersFromRussianStorage = storageRussianAnswers.getAnswersInRussian();
    }

    public String talk(String message){
        String answer;
        String unknownQuestion = "Незнаю";

        int randomIndex = random.nextInt(russianQuestions.size());
        String randomQuestion = russianQuestions.get(randomIndex);

        answer = (isAskedQuestion(message)) ? getAnswerOnAsked(unknownQuestion, message)
                                            : getAnswerOnAsked(randomQuestion, message);

        return answer;
    }

    public String getBotName(){
        return this.botName;
    }

    private String getAnswerOnAsked(String unknownQuestion, String message){
        String answer;
        if (isFoundInEnglishStorage(answersFromEnglishStorage, message)) {

            answer = getAnswerFromStorage(answersFromEnglishStorage, message);

        } else if (isFoundInRussianStorage(answersFromRussianStorage, message)) {

            answer = getAnswerFromStorage(answersFromRussianStorage, message);

        } else {
            answer = unknownQuestion;
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

    private boolean isFoundAnswer(String message, String key){
        String messageWithoutSpaces;
        if(isAskedQuestion(message)){
            String messageWithoutQuestion = message.replace('?',' ');
            messageWithoutSpaces = messageWithoutQuestion.replaceAll(" ", "");

        }
            messageWithoutSpaces = message.replaceAll(" ", "");

        return messageWithoutSpaces.contains(key);
    }

    private boolean isAskedQuestion(String message){
       return message.trim().endsWith("?");
    }

    private boolean isFoundInEnglishStorage(Map<String, String>  answersFromEnglishStorage, String message){
        return getAnswerFromStorage(answersFromEnglishStorage, message) != null;
    }

    private boolean isFoundInRussianStorage(Map<String, String>  answersFromRussianStorage, String message){
        return getAnswerFromStorage(answersFromRussianStorage, message) != null;
    }
}
