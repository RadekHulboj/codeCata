package eu.hulboj.hacker;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;


/*
This is a demo task.

        Write a function:

class Solution { public int solution(int[] A); }

that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.

        For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.

        Given A = [1, 2, 3], the function should return 4.

        Given A = [−1, −3], the function should return 1.

        Assume that:

        N is an integer within the range [1..100,000];
        each element of array A is an integer within the range [−1,000,000..1,000,000].
        Complexity:

        expected worst-case time complexity is O(N);
        expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).
*/


class Online_01 {
    public int solution(int[] A) {
        int max = Arrays.stream(A).max().getAsInt();
        int min = Arrays.stream(A).min().getAsInt();
        if(max < 0  && min < 0) {
            return 1;
        }
        List<Integer> duplicates = Arrays.stream(A)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(integerLongEntry -> integerLongEntry.getValue() > 1)
                .map(integerLongEntry -> integerLongEntry.getKey())
                .collect(Collectors.toList());
        if(duplicates.size() == 0) {
            return max + 1;
        }

        List<Integer> removeDuplicates = Arrays.stream(A).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .map(integerLongEntry -> integerLongEntry.getKey())
                .collect(Collectors.toList());
        for(int i = 0; i < removeDuplicates.size(); i++) {
            if(i+1 != removeDuplicates.get(i)) {
                return i+1;
            }
        }
        return 0;
    }
}