import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class LongestIncrSubsequence {
    public static void main(String args[]) {
        int[] arr = new int[] {3, 10, 3, 11, 4, 5, 6, 7, 8, 12};

        int l = longestSubSequence(arr, arr.length);

        System.out.println(l);
    }

    private static int longestSubSequence(int[] arr, int n) {
//        int n = arr.length;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(arr[0], 1);

        for(int i=1 ; i<n ; i++) {
            if(map.containsKey(arr[i]-1)) {
                map.put(arr[i], map.get(arr[i]-1) + 1);
                map.remove(arr[i]-1);
            } else {
                map.put(arr[i], 1);
            }
        }

        return Collections.max(map.values());
    }
}
