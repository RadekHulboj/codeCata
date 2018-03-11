package eu.hulboj.hacker.task2;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

/**
 * Created by radoslaw on 11.03.18.
 */
public class OddOccurrencesInArrayTest {
    @Test
    public void useCase1() throws Exception {
        // given
        //                   0 1 2 3 4 5 6
        int[] A = new int[] {9,3,9,3,9,7,9};
        // when
        int res = new OddOccurrencesInArray().execute(A);
        // then
        assertThat(res, is(7));

    }
}