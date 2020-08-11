
/*
53. 最大子序和

https://leetcode-cn.com/problems/maximum-subarray/
 */

public class MaxSubSequenceSum {

    public static void main(String[] args) {

        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};

        System.out.println(new MaxSubSequenceSum().maxSubArray(nums));
    }

    public int maxSubArray(int[] nums) {

        int max = Integer.MIN_VALUE;

        int[] maxArray = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                maxArray[i] = nums[i];
                max = nums[i];
            } else {
                maxArray[i] = Math.max(nums[i], nums[i] + maxArray[i-1]);
                max = Math.max(max, maxArray[i]);
            }
        }

        return max;
    }
}
