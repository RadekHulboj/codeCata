package eu.hulboj.hacker.task5;

import java.util.Stack;

/**
 * Created by radoslaw on 20.03.18.
 */
public class Brackets {
    public int solution(String s) {
        Stack<Integer> tokens = new Stack<>();
        char[] a1 = {'{', '}'};
        char[] a2 = {'(', ')'};
        char[] a3 = {'[', ']'};
        for (char c : s.toCharArray()) {
            updateStack(tokens, a1, c, 1);
            updateStack(tokens, a2, c, 2);
            updateStack(tokens, a3, c, 3);
        }
        return tokens.size() > 0 ? 0 : 1;
    }

    private void updateStack(Stack<Integer> tokens, char[] a1, char c, int item) {
        if (c == a1[0]) {
            tokens.push(item);
        }
        if (c == a1[1]) {
            Integer stack = tokens.peek();
            if (stack == item) {
                tokens.pop();
            }
        }
    }
}
