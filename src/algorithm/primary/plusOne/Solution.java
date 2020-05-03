package algorithm.primary.plusOne;

public class Solution {
    public int[] plusOne(int[] digits) {
        if (digits != null && digits.length > 0) {
            int addNum = 0;
            for (int i = digits.length - 1; i >= 0; i--) {
                int endNum;
                //最后一个元素加1，后续元素加进位1
                if (i == digits.length - 1) {
                    endNum = digits[i] + 1 + addNum;
                } else {
                    endNum = digits[i] + addNum;
                }

                //判断计算的元素是否大于等于10，若是，需要向前进1
                if (endNum >= 10) {
                    addNum = 1;
                    digits[i] = endNum % 10;
                } else {
                    addNum = 0;
                    digits[i] = endNum;
                    break;
                }
            }
            int[] result;
            if (addNum != 0) {
                result = new int[digits.length + 1];
                result[0] = addNum;
                System.arraycopy(digits, 0, result, 1, digits.length);
                return result;
            } else {
                return digits;
            }
        }
        return null;
    }
}
