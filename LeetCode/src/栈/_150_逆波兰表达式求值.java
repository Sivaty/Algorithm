package 栈;

import java.util.Stack;

class main {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            String c = tokens[i];
            if (c.equals("+") || c.equals("-") || c.equals("*") || c.equals("/")) {
                int a = stack.pop();
                int b = stack.pop();
                stack.push(cal(c,b,a));
            }
            else {
                stack.push(Integer.valueOf(c));
            }
        }

        return stack.pop();
    }

    private int cal(String sig,int a,int b){
        switch(sig){
            case "+":
                return a+b;
            case "-":
                return a-b;
            case "*":
                return a*b;
            case "/":
                return a/b;
        }
        return 0;
    }

    public void main() {
        String[] tokens = new String[] {
                "2","1","+","3","*"
        };
        evalRPN(tokens);
    }

}
