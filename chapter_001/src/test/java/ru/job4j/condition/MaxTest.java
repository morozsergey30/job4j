package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax3To2Then3() {
        int result = Max.max(3, 2);
        assertThat(result, is(3));
    }

    @Test
    public void whenMax5To5Then5() {
        int result = Max.max(5, 5);
        assertThat(result, is(5));
    }

    @Test
    public void whenMax5To2And3Then5() {
        int result = Max.max(2, 3, 5);
        assertThat(result, is(5));
    }

    @Test
    public void whenMax9To5And2Then9() {
        int result = Max.max(9, 5, 2);
        assertThat(result, is(9));
    }

    @Test
    public void whenMax7To2And4And5Then7() {
        int result = Max.max(2, 5, 4, 7);
        assertThat(result, is(7));
    }

    @Test
    public void whenMax8To5And7And1Then8() {
        int result = Max.max(8, 5, 1, 7);
        assertThat(result, is(8));
    }

}
