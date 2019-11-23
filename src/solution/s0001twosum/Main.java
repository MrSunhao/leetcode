package solution.s0001twosum;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        s0001 two sum
        Solution solution = new Solution();
        Solution2 solution2 = new Solution2();
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(solution.twoSum(nums, target)));
        System.out.println(Arrays.toString(solution2.twoSum(nums, target)));
    }
}
