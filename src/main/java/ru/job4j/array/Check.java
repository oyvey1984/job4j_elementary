package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (boolean datum : data) {
            boolean temp = data[0];
            if (datum != data[0]) {
                result = false;
            }
        }
        return result;
    }
}