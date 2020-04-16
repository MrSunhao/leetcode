package algorithm.primary.singleNumber;

import java.util.Arrays;
import java.util.HashSet;

public class Solution {
    /***
     * @author sunth
     * @date 2020/4/16 10:57 下午
     * @description 嵌套循环，不符合题意
     */
    public int singleNumber(int[] nums) {
        if (nums != null && nums.length > 0) {
            for (int i = 0; i < nums.length; i++) {
                boolean hasFind = false;
                for (int j = 0; j < nums.length; j++) {
                    if (nums[i] == nums[j] && i != j) {
                        hasFind = true;
                        break;
                    }
                }

                if (!hasFind) {
                    return nums[i];
                }
            }
        }
        return 0;
    }

    /***
     * @author sunth
     * @date 2020/4/16 11:01 下午
     * @description 利用hashSet 特性实现
     */
    public int singleNumber2(int[] nums) {
        if (nums != null && nums.length > 0) {
            HashSet<Integer> numsSet = new HashSet<>();
            for (int num : nums) {
                // 加入失败，说明有相同的数字存在
                if (!numsSet.add(num)) {
                    numsSet.remove(num);
                }
            }
            return numsSet.iterator().next();

        }

        return 0;
    }

    /***
     * @author sunth
     * @date 2020/4/16 11:21 下午
     * @description 排序 比较，分组
     */
    public int singleNumber3(int[] nums) {
        if (nums != null && nums.length > 0) {
            Arrays.sort(nums);
            for (int i = 0; i < nums.length - 1; i += 2) {
                if (nums[i] != nums[i + 1]) {
                    return nums[i];
                }
            }
            return nums[nums.length - 1];

        }
        return 0;
    }

    /***
     * @author sunth
     * @date 2020/4/16 11:24 下午
     * @description 利用异或运算的特性
     * 任何数与0异或都是它本身，相同数异或等于0。
     */
    public int singleNumber4(int[] nums) {
        if (nums != null && nums.length > 0) {
            int num = 0;
            for (int i = 0; i < nums.length; i++) {
                num = num ^ nums[i];
            }
            return num;

        }
        return 0;
    }
}
