package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left >= right ? left : right;
    }

    public static int max(int left, int right, int midl) {
        return max(max(left, right), midl);
    }

    public static int max(int left, int right, int midl, int down) {
        return max(max(left, right, midl), down);
    }
}