package solution.s0001twosum;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        List<Integer> newNumList = new ArrayList<>();
        int[] res = new int[2];
        for (int a : nums) {
            newNumList.add(a);
        }
        for (int num : newNumList) {
            int nextNum = target - num;
            if (newNumList.lastIndexOf(nextNum) > newNumList.indexOf(num) && newNumList.lastIndexOf(nextNum) != -1) {
                res[0] = newNumList.indexOf(num);
                res[1] = newNumList.lastIndexOf(nextNum);
                break;
            }
        }
        return res;
    }
}
