package eu.hulboj.hacker;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by radoslaw on 10.03.18.
 */
public class Online01Test {
    @Test
    public void useCase1() throws Exception {
        //given
        Online01 solution = new Online01();
        List<Integer> integers = Arrays.asList(-1,-3);
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
        List<Integer> integers = Arrays.asList(1, 2, 3);
        int[] ints = integers.stream().mapToInt((Integer value) -> value.intValue()).toArray();
        //when
        int solution1 = solution.solution(ints);
        //then
        assertTrue(solution1 == 4);
    }

    @Test
    public void useCase3() throws Exception {
        //given
        Online01 solution = new Online01();
        List<Integer> integers = Arrays.asList(1, 3, 6, 4, 1, 2);
        int[] ints = integers.stream().mapToInt((Integer value) -> value.intValue()).toArray();
        //when
        int solution1 = solution.solution(ints);
        //then
        assertTrue(solution1 == 5);
    }
}