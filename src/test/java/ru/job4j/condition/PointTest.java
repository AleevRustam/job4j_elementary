package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.withPrecision;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class PointTest {

    @Test
    void when00to20then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when11to31then2() {
        double expected = 2;
        int x1 = 1;
        int y1 = 1;
        int x2 = 3;
        int y2 = 1;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenMinus1Minus2to66then10Dot63() {
        double expected = 10.63;
        int x1 = -1;
        int y1 = -2;
        int x2 = 6;
        int y2 = 6;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}