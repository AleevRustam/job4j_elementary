package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.withPrecision;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class RectangleAreaTest {

    @Test
    void whenP6K2Square2() {
        int expected = 2;
        int p = 6;
        double k = 2;
        double output = RectangleArea.square(p, k);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenP12K3Square6Dot75() {
        double expected = 6.75;
        int p = 12;
        double k = 3;
        double output = RectangleArea.square(p, k);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenP15K5Square7Dot81() {
        double expected = 7.81;
        int p = 15;
        double k = 5;
        double output = RectangleArea.square(p, k);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}