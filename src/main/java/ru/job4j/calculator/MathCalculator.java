package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double subAndSegment(double first, double second) {
        return subtraction(first, second)
                + segmentation(first, second);
    }

    public static double allSum(double first, double second) {
        return sum(first, second)
                + multiply(first, second)
                + subtraction(first, second)
                + segmentation(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета суммы и умножения равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета вычитания и деления равен: " + subAndSegment(10, 20));
        System.out.println("Результат расчета суммы, умножениия, вычитания и деления равен: " + allSum(10, 20));

    }
}