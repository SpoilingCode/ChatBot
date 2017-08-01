package answersstorage.englishanswers;

import java.util.ArrayList;
import java.util.List;

/**
 * English quotation store
 */
public class StorageEnglishGeneralPhrases {
    private List<String> englishGeneralPhrases;

    public StorageEnglishGeneralPhrases() {
        englishGeneralPhrases = new ArrayList<String>(){{
            add("An honest answer is the sign of true friendship.");
            add("Two things are infinite: the universe and human stupidity; and I’m not sure about the universe.");
            add("One who looks for a friend without faults will have none.");
            add("Keep cool; anger is not an argument.");
            add("It is always a silly thing to give advice, but to give good advice is fatal. ");
            add("Fortune is easily found, but hard to be kept.");
            add("Fortune is easily found, but hard to be kept.");
            add("I learned that it is the weak who are cruel, and that gentleness is to be expected only from the strong");
        }};
    }

    public List<String> getEnglishGeneralPhrases() {
        return englishGeneralPhrases;
    }
}
