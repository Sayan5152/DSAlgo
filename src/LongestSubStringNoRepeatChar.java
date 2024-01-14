import java.lang.management.MemoryType;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubStringNoRepeatChar {
    public static void main(String args[]) {
        String s = "bbbbbb";
        System.out.println(lengthOfLongestSubstring(s));
    }

    private static int lengthOfLongestSubstring(String s) {
        int longest = 0;
        char[] arr = s.toCharArray();
        int i=0,j=0;
        Set<Character> set = new HashSet<>();

        while(j<arr.length) {
            if(!set.contains(arr[j])) {
                set.add(arr[j]);
                longest = Math.max(longest, j-i+1);
                j++;
            }
            else {
                while(set.contains(arr[j])) {
                    set.remove(arr[i]);
                    i++;
                }
            }
        }


        return longest;
    }
}
