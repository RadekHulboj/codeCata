package eu.hulboj.hacker.task2;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by radoslaw on 11.03.18.
 */
public class OddOccurrencesInArray {

    public int execute(int[] A) {
        return Arrays.asList(A)
                .stream()
                .flatMapToInt(IntStream::of)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(integerLongEntry -> integerLongEntry.getValue() == 1)
                .collect(Collectors.toList())
                .get(0)
                .getKey();

    }
}
