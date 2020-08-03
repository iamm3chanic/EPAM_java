package logic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;

import domain.Sentence;
import domain.Word;

/**
 * This class holds a text as a list of sentences,
 * replaces tabs and sequences of spaces with one space
 * and starts words processing.
 *
 */
public class TextParser {
    public void parse() {
        try {
            File file = new File("FakeBookInput.txt");
            FileReader filereader = new FileReader(file);
            BufferedReader reader = new BufferedReader(filereader);
            String line = "";
            String nextLine = reader.readLine();
            while (nextLine != null) {
                line += nextLine;
                nextLine = reader.readLine();
            }
            reader.close();
            line = line.replaceAll("([\\s]+)", " ");
            line = line.trim();
            System.out.println("The text is read from the file:");
            System.out.println(line);
            System.out.println("\nThe text is disassembled into elements:");

            Text text = new Text(line);

            LinkedList<Sentence> sentences = text.getText();
            for(Sentence sentence : sentences) {
                System.out.println(sentence);
            }

            System.out.println("\nTask 8: Sorted on first consonant letter");
            ArrayList<Word> task8 = text.task8();
            for(Word word : task8) {
                System.out.println(word);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
