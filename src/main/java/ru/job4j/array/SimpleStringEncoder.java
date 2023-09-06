package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        StringBuilder result = new StringBuilder();
        char symbol = input.charAt(0);
        int counter = 1;

        for (int index = 1; index < input.length(); index++) {
            if (symbol == input.charAt(index)) {
                counter++;
            } else if (counter == 1) {
                result.append(symbol);
                symbol = input.charAt(index);
            }  else {
                result.append(symbol).append(counter);
                symbol = input.charAt(index);
                counter = 1;
            }
        }
        result.append(symbol).append(counter);
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(encode("abbbcvvvvc"));
    }
}