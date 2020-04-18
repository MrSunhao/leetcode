package algorithm.primary.intersect;

import java.util.*;

public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums1 == null || nums2 == null) {
            return new int[0];
        }
        List<Integer> integerList = new ArrayList<>();
        HashSet<Integer> integerHashSet = new HashSet<>();

        for (int value : nums1) {
            for (int j = 0; j < nums2.length; j++) {
                if (value == nums2[j] && !integerHashSet.contains(j)) {
                    integerList.add(value);
                    integerHashSet.add(j);
                    break;
                }
            }
        }

        if (!integerList.isEmpty()) {
            int[] result = new int[integerList.size()];
            for (int i = 0; i < integerList.size(); i++) {
                result[i] = integerList.get(i);
            }

            return result;
        }
        return new int[0];

    }

    public int[] intersect2(int[] nums1, int[] nums2) {
        if (nums1 == null || nums2 == null) {
            return new int[0];
        }
        List<Integer> integerList = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        for (int i = 0, j = 0; i < nums1.length && j < nums2.length; ) {
            if (nums1[i] == nums2[j]) {
                integerList.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }

        }


        if (!integerList.isEmpty()) {
            int[] result = new int[integerList.size()];
            for (int i = 0; i < integerList.size(); i++) {
                result[i] = integerList.get(i);
            }
            return result;
        }
        return new int[0];
    }

}
