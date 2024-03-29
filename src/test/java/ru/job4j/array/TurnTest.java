package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class TurnTest {
    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        int[] input = new int[] {4, 1, 6, 2};
        int[] result = Turn.back(input);
        int[] expected = new int[] {2, 6, 1, 4};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        int[] input = new int[] {1, 2, 3, 4, 5};
        int[] result = Turn.back(input);
        int[] expected = new int[] {5, 4, 3, 2, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void from1ToNine() {
        int[] input = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] result = Turn.back(input);
        int[] expected = new int[] {9, 8, 7, 6, 5, 4, 3, 2, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void randomNumber() {
        int[] input = new int[] {15, 100, 78, 153, 55, 24};
        int[] result = Turn.back(input);
        int[] expected = new int[] {24, 55, 153, 78, 100, 15};
        assertThat(result).containsExactly(expected);
    }
}