package solution.s0001twosum;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        s0001 two sum
        Solution solution = new Solution();
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(solution.twoSum(nums, target)));
    }
}
