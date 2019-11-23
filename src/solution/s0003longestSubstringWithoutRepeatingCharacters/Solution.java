package solution.s0003longestSubstringWithoutRepeatingCharacters;


import java.util.HashSet;
import java.util.Set;

public class Solution {
    /***
     * @author sunth
     * @date 2019/7/15 0:05
     * @Description 解法2
     */
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int res = 0;
        int end=0,start=0;
        Set<Character> set=new HashSet<>();
        while(start<n && end<n){
            if(set.contains(s.charAt(end))){
                set.remove(s.charAt(start++));
            }else{
                set.add(s.charAt(end++));
                res=Math.max(res,end-start);
            }

        }
        return res;
    }


    /***
     * @author sunth
     * @date 2019/7/15 0:05
     * @Description 解法1
     */
    public int lengthOfLongestSubstring1(String s) {
        if (!s.isEmpty()) {
            char[] chars = s.toCharArray();
            if (chars.length == 1) {
                return 1;
            }
            int length = 0;
            String str = "";
            int j = 0;
            for (int i = 0; i < chars.length; i++) {
                if (!str.contains(String.valueOf(chars[i]))) {
                    str += String.valueOf(chars[i]);
                    if (str.length() > length) {
                        length = str.length();
                    }
                } else {
                    if (str.length() > length) {
                        length = str.length();
                    }
                    j++;
                    i = j;
                    str = String.valueOf(chars[i]);
                }
            }
            return length;
        }
        return 0;
    }
}
