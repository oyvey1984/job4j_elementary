package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double x2Minusx1 = x2 - x1;
        double y2Minusy1 = y2 - y1;
        double powX = Math.pow(x2Minusx1, 2);
        double powY = Math.pow(y2Minusy1, 2);
        double powXPluspowY = powX + powY;
        double rsl = Math.sqrt(powXPluspowY);
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        double result2 = Point.distance(2, 5, 5, 8);
        double result3 = Point.distance(-2, 55, 14, -355);
        System.out.println("result (0, 0) to (2, 0) " + result);
        System.out.println("result (2, 5) to (5, 8) " + result2);
        System.out.println("result (-2, 55) to (14, -355) " + result3);
    }
}