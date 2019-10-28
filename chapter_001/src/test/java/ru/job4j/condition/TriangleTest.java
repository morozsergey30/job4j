package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class TriangleTest {
    @Test
    public void whenFirst11Second24Third62() {
        Point a = new Point(1, 1);
        Point b = new Point(2, 4);
        Point c = new Point(6, 2);
        Triangle triangle = new Triangle(a, b, c);
        double area = triangle.area();
        double expected = 7.00;
        Assert.assertEquals(area, expected, 0.01);
    }
    @Test
    public void whenFirst12Second21Third33() {
        Point a = new Point(1, 2);
        Point b = new Point(2, 1);
        Point c = new Point(3, 3);
        Triangle triangle = new Triangle(a, b, c);
        double area = triangle.area();
        double expected = 1.5;
        Assert.assertEquals(area, expected, 0.01);
    }
}
