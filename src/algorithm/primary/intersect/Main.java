package algorithm.primary.intersect;

public class Main {
    public static void main(String[] args) {

        int[] nums1 = new int[]{4, 9, 5};
        int[] nums2 = new int[]{9, 4, 9, 8, 4};
        Solution solution = new Solution();
        int[] result = solution.intersect2(nums1, nums2);
        for (Integer value :
                result) {
            System.out.println(value);
        }
    }
}
