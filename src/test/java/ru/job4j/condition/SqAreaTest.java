package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void whenP6K2Square2() {
        int expected = 2;
        int p = 6;
        double k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP24K5Square20() {
        int expected = 20;
        int p = 24;
        double k = 5;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP36K2Square72() {
        int expected = 72;
        int p = 36;
        double k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}