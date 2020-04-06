package algorithm.primary.removeDuplicates;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
//        int[] nums = {1,1,2};
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int result = solution.removeDuplicates(nums);
        System.out.println(result);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
