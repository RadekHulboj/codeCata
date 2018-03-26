package eu.hulboj.hacker.task6

import spock.lang.Specification

/**
 * Created by radoslaw on 26.03.18.
 */
class PassingCarsTest extends Specification {
    PassingCars passingCars = new PassingCars()
    def "taking array from the codility" () {
        given:
        int[] a = input;
        when:
        def solution = passingCars.solution(a);
        then:
        solution == result;
        where:
        input       | result
        [0,1]       | 1
        [0, 1, 1]   | 2
        [0, 1,0,1]  | 3
        [0,1,0,1,1] | 5
    }
}
