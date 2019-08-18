package 栈;

import java.util.Stack;

public class _224_基本计算器 {
    public int calculate(String s) {
        if (s == null || s.length() == 0) return 0;
        int length = s.length();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
        }

    }
    private int cal(char c, int a, int b) {
        if (c == '+') {
            return a + b;
        }
        else return a - b;
    }
}
