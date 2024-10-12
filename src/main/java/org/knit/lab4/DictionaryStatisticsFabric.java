package org.knit.lab4;

public class DictionaryStatisticsFabric {
    public static int getWordMaxLen(String[] words){
        int len = 0;
        for (String word: words){
            len = Math.max(len, word.length());
        }
        return len;
    }

    public static int getWordMinLen(String[] words) {
        int len = (int) Math.pow(10,10);
        for (String word: words){
            len = Math.min(len, word.length());
        }
        return len;
    }
    public static int getPolindrom(String[] words){
        int count = 0;
        for (String word: words){
            if (reverseStirng(word)){
                count += 1;
            }
        }
        return count;
    }
    private static boolean reverseStirng(String word){
        char[] array = word.toCharArray();
        String result = "";
        for (int i = word.length() - 1; i>= 0; i--){
            result += i;
        }
        if (word.equals(result)){
            return true;
        }
        return false;
    }
}
