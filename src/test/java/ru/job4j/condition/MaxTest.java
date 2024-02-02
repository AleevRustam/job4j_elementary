package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static ru.job4j.condition.Max.max;

class MaxTest {
    @Test
    void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax3To2Then3() {
        int left = 3;
        int right = 2;
        int result = max(left, right);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax3To3Then3() {
        int left = 3;
        int right = 3;
        int result = max(left, right);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax1To2To3Then3() {
        int first = 1;
        int second = 2;
        int third = 3;
        int result = max(first, second, third);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax5To6To2Then6() {
        int first = 5;
        int second = 6;
        int third = 2;
        int result = max(first, second, third);
        int expected = 6;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax5To5To2Then5() {
        int first = 5;
        int second = 5;
        int third = 2;
        int result = max(first, second, third);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax1To2To3To4Then4() {
        int first = 1;
        int second = 2;
        int third = 3;
        int fourth = 4;
        int result = max(first, second, third, fourth);
        int expected = 4;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax1To1To3To3Then3() {
        int first = 1;
        int second = 1;
        int third = 3;
        int fourth = 3;
        int result = max(first, second, third, fourth);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax10To12To8To7Then12() {
        int first = 10;
        int second = 12;
        int third = 8;
        int fourth = 7;
        int result = max(first, second, third, fourth);
        int expected = 12;
        assertThat(result).isEqualTo(expected);
    }

}