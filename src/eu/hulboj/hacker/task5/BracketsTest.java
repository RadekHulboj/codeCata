package eu.hulboj.hacker.task5;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.runners.Parameterized.Parameters;

/**
 * Created by radoslaw onplugin 20.03.18.
 */
@RunWith(Parameterized.class)
public class BracketsTest {
    private final String data;
    private final int result;
    Brackets brackets;

    @Parameters
    public static Collection<Object[]> data() {
        Collection<Object[]> strings = Arrays.asList(new Object[][]{
                {"{}", 1},
                {"{()({})", 0},
                {"", 1},
                {"(", 0},
                {"[{}]()[]", 1},
                {"[{}]()[]{", 0},
                {"{{{}}}", 1},
                {"][", 0}
        });
        return strings;
    }

    public BracketsTest(String data, int result) {
        this.data = data;
        this.result = result;
    }

    @Before
    public void before() {
        brackets  = new Brackets();
    }
    @Test
    public void pairTests1() {
        int solution = brackets.solution(data);
        assertThat(solution, is(result));
    }
}