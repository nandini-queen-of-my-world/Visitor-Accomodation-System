import java.util.List;

public class BasicDocument extends Document {
    public BasicDocument(String text) {
        super(text);
    }

    @Override
    public int getNumWords() {
        List<String> tokens = getTokens("[a-zA-Z]+");
        return tokens.size();
    }

    @Override
    public int getNumSentences() {
        List<String> tokens = getTokens("[^.!?]+");
        return tokens.size();
    }

    @Override
    public int getNumSyllables() {
        List<String> tokens = getTokens("[a-zA-Z]+");
        int totalSyllables = 0;
        for (String word : tokens) {
            totalSyllables += countSyllables(word);
        }
        return totalSyllables;
    }

    protected List<String> getTokens(String pattern) {
        return java.util.Arrays.asList(text.split(pattern));
    }

    protected static int countSyllables(String word) {
        int numSyllables = 0;
        boolean newSyllable = true;
        String vowels = "aeiouy";
        char[] cArray = word.toCharArray();
        for (int i = 0; i < cArray.length; i++) {
            if (i == cArray.length - 1 && Character.toLowerCase(cArray[i]) == 'e'
                    && newSyllable && numSyllables > 0) {
                numSyllables--;
            }
            if (newSyllable && vowels.indexOf(Character.toLowerCase(cArray[i])) >= 0) {
                newSyllable = false;
                numSyllables++;
            } else if (vowels.indexOf(Character.toLowerCase(cArray[i])) < 0) {
                newSyllable = true;
            }
        }
        return numSyllables;
    }
}
