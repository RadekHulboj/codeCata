package eu.hulboj.hacker.task6;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by radoslaw on 26.03.18.
 */

//https://app.codility.com/programmers/lessons/5-prefix_sums/passing_cars/
public class PassingCars {
    List<Pair> pairList = new ArrayList<>();
    List<Integer> zeros = new ArrayList<>();

    public int solution(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                addPositionOfZeroValue(i);
            }
            if (a[i] == 1) {
                createPair(i);
            }
        }
        return pairList.size();
    }

    private void addPositionOfZeroValue(int i) {
        zeros.add(i);
    }

    private void createPair(int i) {
        for (int j = 0; j < zeros.size(); j++) {
            pairList.add(new Pair(zeros.get(j), i));
        }
    }
}
