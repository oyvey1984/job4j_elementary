package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        StringBuilder result = new StringBuilder();
        char symbol = input.charAt(0);
        int counter = 1;

        for (int index = 0; index < input.length() - 1; index++) {
            if (input.charAt(index) != input.charAt(index++)) {
                result.append(input.charAt(index)).append(index++);
            }
            if (input.charAt(index) == input.charAt(index++)) {
                while (input.charAt(index) == input.charAt(index++)) {
                    counter++;
                }
                result.append(input.charAt(index)).append(counter);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(encode("ffffff"));
    }
}