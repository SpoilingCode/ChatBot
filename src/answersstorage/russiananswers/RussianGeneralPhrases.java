package answersstorage.russiananswers;

import java.util.ArrayList;
import java.util.List;

/**
 * Russian quotation store
 */
public class RussianGeneralPhrases {
    private List<String> russianGeneralPhrases;

    public RussianGeneralPhrases() {
        russianGeneralPhrases = new ArrayList<String>(){{
            add("Мир - лотерея богатств, званий, почестей, прав, отыскиваемых без основания и раздаваемых без выбора.");
            add("Мы оставим сей мир таким же глупым и таким же злым, каким мы нашли его при своем появлении.");
            add("Хочешь, чтобы мир стал лучше? Начни с самого себя!");
            add("Если бы мир всегда держался здравого смысла, мы до сих пор ходили бы на четвереньках.");
            add("Глядя на мир, нельзя не удивляться!");
            add("Создать мир легче, чем понять его.");
            add("Если осталось еще что-нибудь доделать, считай, что ничто не сделано.");
            add("Все плохое когда-нибудь кончается. И начинается чудовищное. ");
        }};
    }

    public List<String> getRussianGeneralPhrases() {
        return russianGeneralPhrases;
    }
}
