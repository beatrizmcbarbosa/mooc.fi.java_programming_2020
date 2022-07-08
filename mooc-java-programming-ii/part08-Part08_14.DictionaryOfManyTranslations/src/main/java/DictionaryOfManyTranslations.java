import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> translatedWord;

    public DictionaryOfManyTranslations() {
        this.translatedWord = new HashMap<>();
    }

    public void add(String word, String translation) {
        this.translatedWord.putIfAbsent(word, new ArrayList<String>());

        this.translatedWord.get(word).add(translation);

    }

    public ArrayList<String> translate(String word) {
        ArrayList<String> emptyList = new ArrayList<>();

        return this.translatedWord.getOrDefault(word, emptyList);
    }

    public void remove(String word) {
            this.translatedWord.remove(word);
    }

}
