package domain;

import java.util.LinkedList;

/**
 * This class represents a sentence which consists of a list of
 * a sentence element(words, email, phone numbers, punctuation marks,
 * sentence ends). 
 *
 */
public class Sentence {

    private LinkedList<SentenceElement> sentence;

    public Sentence(LinkedList<SentenceElement> sentence) {
        this.sentence = sentence;
    }

    @Override
    public String toString() {
        return "Sentence={" + sentence + '}';
    }
}
