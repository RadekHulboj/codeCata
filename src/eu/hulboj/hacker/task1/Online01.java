package eu.hulboj.hacker.task1;

import java.util.HashSet;


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


class Online01 {
    public int solution(int[] A) {
        int num = 1;
        HashSet<Integer> hset = new HashSet<>();
        for (int i = 0 ; i < A.length; i++) {
            hset.add(A[i]);
        }
        while (hset.contains(num)) {
            num++;
        }
        return num;
    }
}