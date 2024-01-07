package ru.job4j;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class JUnitExampleTest {

    @Test
    @DisplayName("When 5 multi 5 should be 25")
    void when5and5then25() {
        JUnitExample example = new JUnitExample();
        int result = example.multiply(5, 5);
        assertThat(result).isEqualTo(25);
    }
}