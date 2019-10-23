package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void square() {
        int pIn = 6;
        int kIn = 2;
        double expected = 2;
        double out = SqArea.square(pIn, kIn);
        Assert.assertEquals(expected, out, 0.01);
    }
}
