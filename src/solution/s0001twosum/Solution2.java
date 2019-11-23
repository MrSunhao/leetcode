package solution.s0001twosum;

import java.util.HashMap;
import java.util.Map;

public class Solution2 {
    public int[] twoSum(int[] nums, int target) {
        if (nums != null && nums.length > 0) {
            Map<Integer, Integer> numMap = new HashMap<>();
            int[] result = new int[2];
            for (int i = 0; i < nums.length; i++) {
                int nextNum = target - nums[i];
                if (numMap.containsKey(nextNum)) {
                    result[0] = numMap.get(nextNum);
                    result[1] = i;
                    return result;
                } else {
                    numMap.put(nums[i], i);
                }

            }
        }
        return null;
    }
}
