package eu.hulboj.hacker.task1;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

/**
 * Created by radoslaw on 10.03.18.
 */
public class Online01Test {
    @Test
    public void useCase1() throws Exception {
        //given
        Online01 solution = new Online01();
        List<Integer> integers = Arrays.asList(-1, -3);
        int[] ints = integers.stream().mapToInt((Integer value) -> value.intValue()).toArray();
        //when
        int solution1 = solution.solution(ints);
        //then
        assertTrue(solution1 == 1);
    }

    @Test
    public void useCase2() throws Exception {
        //given
        Online01 solution = new Online01();
        int[] ints = new int[]{1, 2, 3};
        //when
        int solution1 = solution.solution(ints);
        //then
        assertTrue(solution1 == 4);
    }

    @Test
    public void useCase3() throws Exception {
        //given
        Online01 solution = new Online01();
        int[] ints = new int[]{1, 3, 6, 4, 1, 2};
        //when
        int solution1 = solution.solution(ints);
        //then
        assertTrue(solution1 == 5);
    }

    @Test
    public void useCase4() throws Exception {
        //given
        int[] ints = new int[]{456, 45, 667, 7, 8, 8};
        //when
        int solution1 = new Online01().solution(ints);
        //then
        assertThat(solution1, is(1));
    }
}