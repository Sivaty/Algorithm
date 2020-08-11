
//  1143. 最长公共子序列
//  https://leetcode-cn.com/problems/longest-common-subsequence/

public class LongestCommonSubsequence {

    public static void main(String[] args) {
        String text1 = "abcde", text2 = "ace";
        System.out.println(new LongestCommonSubsequence().longestCommonSubsequence(text1, text2));
    }

    public int longestCommonSubsequence(String text1, String text2) {
        if (text1 == null || text2 == null) return 0;
        char[] text1Array = text1.toCharArray();
        if (text1Array.length == 0) return 0;
        char[] text2Array = text2.toCharArray();
        if (text2Array.length == 0) return 0;

        char[] rowsArray = text1Array, columnsArray = text2Array;
        if (rowsArray.length < columnsArray.length) {
            rowsArray = text2Array;
            columnsArray = text1Array;
        }

        int[] dp = new int[columnsArray.length + 1];

        for (int i = 1; i <= rowsArray.length; i++) {
            int cur = 0;
            for (int j = 1; j <= columnsArray.length; j++) {
                int leftTop = cur;
                cur = dp[j];
                if (rowsArray[i - 1] == columnsArray[j - 1]) {
                    dp[j] = leftTop + 1;
                } else {
                    dp[j] = Math.max(dp[j], dp[j - 1]);
                }
            }
        }

        return dp[columnsArray.length];
    }
}
