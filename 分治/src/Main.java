import java.util.ArrayList;

public class Main {

//    剑指 Offer 42. 连续子数组的最大和

    public static void main(String[] args) {

        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        System.out.println(new Main().maxSubArray(nums));
    }

    public int maxSubArray(int[] nums) {
        if (nums.length < 1 || nums == null) return 0;

        return maxSubArray(nums, 0, nums.length);
    }

    public int maxSubArray(int[] nums, int begin, int end) {
        if (end - begin < 2) return nums[begin];
        int mid = (begin + end) >> 1;

        int leftMax = Integer.MIN_VALUE;
        int leftSum = 0;
        for (int i = mid - 1; i >= begin; i--) {
            leftSum += nums[i];
            leftMax = Math.max(leftMax, leftSum);
        }

        int rightMax = Integer.MIN_VALUE;
        int rightSum = 0;
        for (int i = mid; i < end; i++) {
            rightSum += nums[i];
            rightMax = Math.max(rightMax, rightSum);
        }

        return Math.max(leftMax + rightMax,
                Math.max(maxSubArray(nums, begin, mid),
                        maxSubArray(nums, mid, end)));
    }
}
