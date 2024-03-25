import java.util.List;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Document {
    private String text;

    public Document(String text) {
        this.text = text;
    }

    public int getNumWords() {
        List<String> words = getTokens("[a-zA-Z]+");
        return words.size();
    }

    public int getNumSentences() {
        List<String> sentences = getTokens("[.!?]+");
        return sentences.size();
    }

    public int getNumSyllables() {
        List<String> words = getTokens("[a-zA-Z]+");
        int totalSyllables = 0;
        for (String word : words) {
            totalSyllables += countSyllables(word);
        }
        return totalSyllables;
    }

    protected List<String> getTokens(String pattern) {
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);
        List<String> tokens = new ArrayList<>();
        while (m.find()) {
            tokens.add(m.group());
        }
        return tokens;
    }

    protected static int countSyllables(String word) {
        word = word.toLowerCase();
        int numSyllables = 0;
        char[] cArray = word.toCharArray();
        boolean prevIsVowel = false;

        for (char c : cArray) {
            if (isVowel(c)) {
                if (!prevIsVowel) {
                    numSyllables++;
                }
                prevIsVowel = true;
            } else {
                prevIsVowel = false;
            }
        }

        if (word.endsWith("e")) {
            numSyllables--;
        }

        if (numSyllables == 0) {
            numSyllables = 1; // At least one syllable
        }

        return numSyllables;
    }

    private boolean isVowel(char c) {
        return "aeiouy".contains(String.valueOf(c));
    }

    public double getFleschScore() {
        int numWords = getNumWords();
        int numSentences = getNumSentences();
        int numSyllables = getNumSyllables();
        if (numWords == 0 || numSentences == 0) {
            return 0.0;
        }
        return 206.835 - 1.015 * (numWords / numSentences) - 84.6 * (numSyllables / numWords);
    }
}
