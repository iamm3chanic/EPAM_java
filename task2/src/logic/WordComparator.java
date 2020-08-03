package logic;

import java.util.Comparator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import domain.Word;

/**
 * This class sorts words beginning with vowels sorted
 * alphabetically by the first consonant letter of the word
 *
 */
public class WordComparator implements Comparator<Word> {
    public int compare(Word w1, Word w2) {
        String letter1 = null;
        String letter2 = null;

        Matcher matcherSymbol1 = 
                (Pattern.compile("[^aeiouy]")).matcher(w1.toString());
        if(matcherSymbol1.find()) {
            letter1 = matcherSymbol1.group();
        }

        Matcher matcherSymbol2 = 
                (Pattern.compile("[^aeiouy]")).matcher(w2.toString());
        if(matcherSymbol2.find()) {
            letter2 = matcherSymbol2.group();
        }

        return letter1.compareToIgnoreCase(letter2);
    }
}
