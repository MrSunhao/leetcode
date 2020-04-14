package algorithm.primary.rotate;

public class Solution {
    /***
     * @author sunth
     * @date 2020/4/14 12:00 上午
     * @description 方法1 倒序移动数组
     */
    public void rotate(int[] nums, int k) {
        if (nums != null && nums.length > 0) {
            for (int i = 0; i < k; i++) {
                int temp = nums[nums.length - 1];
                for (int j = nums.length - 1; j >= 0; j--) {
                    if (j == 0) {
                        nums[j] = temp;
                    } else {
                        nums[j] = nums[j - 1];
                    }
                }
            }
        }
    }

    /***
     * @author sunth
     * @date 2020/4/14 12:01 上午
     * @description 正序移动数组 每次同下标为0的数值交换
     */
    public void rotate2(int[] nums, int k) {
        if (nums != null && nums.length > 0) {
            for (int i = 0; i < k; i++) {
                int temp;
                for (int j = 0; j < nums.length; j++) {
                    temp = nums[j];
                    nums[j] = nums[0];
                    nums[0] = temp;
                }
            }
        }
    }

    /***
     * @author sunth
     * @date 2020/4/14 10:34 下午
     * @description 正序移动数组，每次同下标为length-1的数值交换
     */
    public void rotate3(int[] nums, int k) {
        if (nums != null && nums.length > 0) {
            for (int i = 0; i < k; i++) {
                int temp;
                for (int j = 0; j < nums.length; j++) {
                    temp = nums[j];
                    nums[j] = nums[nums.length - 1];
                    nums[nums.length - 1] = temp;
                }
            }
        }
    }
}
