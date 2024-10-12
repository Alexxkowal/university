package org.knit.lab4;

import org.knit.lab3.Mage;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.Scanner;

public class DictionaryStatistics {
    private String[] words;
    private int dictionarySize;
    private int polindrom;
    private int maxWordLength;
    private int minWordLength;
    private char[] alphabet;
    private int[] frequency;

    public DictionaryStatistics(String[] words, char[] alphabet) {
        this.words = words;
        this.alphabet = alphabet;
        this.dictionarySize = words.length;
        this.minWordLength = DictionaryStatisticsFabric.getWordMinLen(words);
        this.maxWordLength = DictionaryStatisticsFabric.getWordMaxLen(words);
        this.polindrom = DictionaryStatisticsFabric.getPolindrom(words);
    }
}
