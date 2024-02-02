package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.withPrecision;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class PointTest {

    @Test
    void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when11to31then2() {
        double expected = 2;
        Point a = new Point(1, 1);
        Point b = new Point(3, 1);
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenMinus1Minus2to66then10Dot63() {
        double expected = 10.63;
        Point a = new Point(-1, -2);
        Point b = new Point(6, 6);
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when000To001Then1() {
        double expected = 1.0;
        Point a = new Point(0, 0, 0);
        Point b = new Point(0, 0, 1);
        double output = a.distance3d(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenMinus200To001Then2Dot24() {
        double expected = 2.24;
        Point a = new Point(-2, 0, 0);
        Point b = new Point(0, 0, 1);
        double output = a.distance3d(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}