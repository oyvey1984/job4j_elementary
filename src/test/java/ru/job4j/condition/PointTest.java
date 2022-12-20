package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        Point c = new Point(0, 0);
        Point d = new Point(2, 0);
        double expected = 2;
        Assert.assertEquals(expected, c.distance(d), 0.01);
    }

    @Test
    public void when25to58then4dot24() {
        Point e = new Point(2, 5);
        Point f = new Point(5, 8);
        double expected = 4.24;
        Assert.assertEquals(expected, e.distance(f), 0.01);
    }

    @Test
    public void whenMinus255to14Minus355then410dot31() {
        Point g = new Point(-2, 55);
        Point h = new Point(14, -355);
        double expected = 410.31;
        Assert.assertEquals(expected, g.distance(h), 0.01);
    }
}