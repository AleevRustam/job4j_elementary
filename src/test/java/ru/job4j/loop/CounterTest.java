package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CounterTest {

    @Test
    void whenStart0Finish10Sum55() {
        int start = 0;
        int finish = 10;
        int expected = 55;
        int result = Counter.sum(start, finish);
        assertThat(result).isEqualTo(expected);
    }

    void whenStart10FinishZeroSumZero() {
        int start = 10;
        int finish = 0;
        int expected = 0;
        int result = Counter.sum(start, finish);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenStart10Finish10Sum10() {
        int start = 10;
        int finish = 10;
        int expected = 10;
        int result = Counter.sum(start, finish);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenStart0Finish10SumByEven55() {
        int start = 0;
        int finish = 10;
        int expected = 30;
        int result = Counter.sumByEven(start, finish);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenStartMinus2Finish10SumByEven55() {
        int start = -2;
        int finish = 10;
        int expected = 28;
        int result = Counter.sumByEven(start, finish);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenStart10Finish10SumByEven10() {
        int start = 10;
        int finish = 10;
        int expected = 10;
        int result = Counter.sumByEven(start, finish);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenStart1Finish1SumByEven0() {
        int start = 1;
        int finish = 1;
        int expected = 0;
        int result = Counter.sumByEven(start, finish);
        assertThat(result).isEqualTo(expected);
    }
}