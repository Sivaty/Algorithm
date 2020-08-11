package 回溯;

import java.util.ArrayList;
import java.util.List;

public class _46_全排列 {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for (int i = 0; i < nums.length; i++) {
            List<Integer> tempResult = new ArrayList<Integer>();
            tempResult.add(nums[i]);
            for (int j = 0; j < nums.length; j++) {
                if (i == j) { continue; }
                tempResult.add(nums[j]);
            }
            result.add(tempResult);
        }
        return result;
    }
}
