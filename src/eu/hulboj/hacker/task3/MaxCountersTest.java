package eu.hulboj.hacker.task3;

import static org.junit.Assert.*;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
/**
 * Created by radoslaw on 13.03.18.
 */
public class MaxCountersTest {
    @Test
    public void useCase1() {
        // given
        int[] A = new int[]{3, 4, 4, 6, 1, 4, 4};
        // when
        MaxCounters maxCounters = new MaxCounters();
        int[] solution = maxCounters.solution(5, A);
        // then
        assertThat(solution, is(new int[]{3, 2, 2, 4, 2}));
    }
}