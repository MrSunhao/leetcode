package algorithm.primary.containsDuplicate;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 2, 3, 1};
        System.out.println(solution.containsDuplicate(nums));

        HashSet<Integer> integerHashSet = new HashSet<>();
        integerHashSet.stream().forEach(item -> System.out.println(item));
    }
}
