package algorithm.primary.plusOne;

public class Main {
    public static void main(String[] args) {
        int[] digits = new int[]{9, 9};
        Solution solution = new Solution();
        int[] result = solution.plusOne(digits);

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }

    }
}
