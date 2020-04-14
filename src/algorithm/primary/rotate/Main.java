package algorithm.primary.rotate;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};
        Solution solution = new Solution();
        solution.rotate3(nums, 3);
        System.out.println(nums);
    }
}
