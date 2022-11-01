package ru.job4j.array;

public class ArrayChar {

    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        for (int index = 0; index < word.length; index++) {
            if (word[index] != pref[index]) {
                result = false;
                break;
            } else if (index == word.length - 1 || index == pref.length - 1) {
                break;
            }
        }
        return result;
    }
}