package algorithm.primary.containsDuplicate;

import java.util.*;

public class Solution {
    /***
     * @author sunth
     * @date 2020/4/14 11:18 下午
     * @description hashMap 实现
     */
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> numMap = new HashMap<>();
        if (nums != null && nums.length > 0) {
            for (int i = 0; i < nums.length; i++) {
                if (numMap.containsKey(nums[i])) {
                    return true;
                } else {
                    numMap.put(nums[i], i);
                }
            }

        }
        return false;
    }

    /***
     * @author sunth
     * @date 2020/4/14 11:18 下午
     * @description hashset 实现
     */
    public boolean containsDuplicate2(int[] nums) {
        HashSet<Integer> numSet = new HashSet<>();
        if (nums != null && nums.length > 0) {
            for (int i = 0; i < nums.length; i++) {
                if (numSet.contains(nums[i])) {
                    return true;
                } else {
                    numSet.add(nums[i]);
                }
            }

        }
        return false;
    }
}
