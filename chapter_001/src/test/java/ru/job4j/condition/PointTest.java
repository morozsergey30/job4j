package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void distance() {
        Point a = new Point(1, 1);
        Point b = new Point(2, 5);
        double expected = 4.12;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }
    @Test
    public void distance3d() {
        Point a = new Point(1, 1, 1);
        Point b = new Point(2, 5, 6);
        double expected = 6.48;
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}
