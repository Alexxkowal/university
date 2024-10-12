package org.knit.lab4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) throws FileNotFoundException {
    Scanner scanner = new Scanner(new File("src/main/java/org/knit/lab4/dictionary.txt"));
    ArrayList <String> arrayList = new ArrayList<>();
    while (scanner.hasNext()) {
        String word = scanner.nextLine();
        arrayList.add(word);
    }
    String[] array = arrayList.toArray(new String[0]);
    DictionaryStatistics dictionaryStatistics = new DictionaryStatistics(array);
    System.out.println(dictionaryStatistics);
    scanner.close();
}
}
