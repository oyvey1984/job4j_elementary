package ru.job4j.array;

public class MatrixSum {
    public static int sum(int[][] array) {
        int rsl = 0;
        for (int index = 0; index < array.length; index++) {
            for (int cell = 0; cell < array[index].length; cell++) {
                rsl = rsl + array[index][cell];
            }
        }
        return rsl;
    }
}