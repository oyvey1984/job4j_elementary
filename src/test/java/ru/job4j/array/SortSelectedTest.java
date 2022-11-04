package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void when3numbersSort() {
        int[] data = new int[] {15, 33, 7};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {7, 15, 33};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void when5numbersSort() {
        int[] data = new int[] {101, 55, 1, 0, 47};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {0, 1, 47, 55, 101};
        assertThat(result).containsExactly(expected);
    }
}