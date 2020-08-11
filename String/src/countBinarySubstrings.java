
/*
*   696. 计数二进制子串
*   https://leetcode-cn.com/problems/count-binary-substrings/
* */


public class countBinarySubstrings {

    public static void main(String[] args) {

        System.out.println(new countBinarySubstrings().countBinarySubstrings("10101"));
    }

    public int countBinarySubstrings(String s) {
        if (s == null || s.length() == 1) return 0;

        char[] c = s.toCharArray();

        int lastCount = 1;
        int currentCount = 0;
        int sum = 0;

        char lastC = ' ';

        for (int i = 0; i < c.length; i++) {
            if (c[i] == lastC) {
                currentCount++;
            } else {
                sum += Math.min(lastCount, currentCount);
                lastCount = currentCount;
                currentCount = 1;
            }
            lastC = c[i];
        }

        return sum;
    }
}
