package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SwitchArrayTest {
    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSwap3to4() {
        int[] input = {1, 2, 3, 4, 10, 15, 22};
        int source = 3;
        int dest = 4;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {1, 2, 3, 10, 4, 15, 22};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSwap1to5() {
        int[] input = {1, 2, 3, 4, 10, 15, 22};
        int source = 1;
        int dest = input.length - 2;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {1, 15, 3, 4, 10, 2, 22};
        assertThat(result).containsExactly(expected);
    }
}