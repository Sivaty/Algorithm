package 栈;

import java.util.Stack;

public class _856_括号的分数 {
    public int scoreOfParentheses(String S) {
        int length = S.length();
        int sum = 0;
        int n = 0;
        for (int i = 0; i < length; i++) {
            if (S.charAt(i) == '('){
                if (n == 0) {
                    n = 1;
                }
                else {
                    n = n << 1;
                }
            }
            else if (S.charAt(i) == ')') {
                if (S.charAt(i - 1) == '(') {
                    sum += n;
                }
                n = n >> 1;
            }
        }
        return sum;
    }
}
