import java.util.*;

public class CountWindowDistinct {
    public static void main(String args[]) {
        int[] arr = new int[]{1,2,1,3,4,2,3};
        int k = 4;

        Arrays.stream(countDistintWindow(arr, k)).forEach(System.out::print);
    }

    private static int[] countDistintWindow(int[] arr, int k) {

        // brute force way
//        List<Integer> list = new ArrayList<>();
//
//        int i=0;
//        int j= k-1;
//
//        while(j<arr.length) {
//            Set<Integer> set = new HashSet<>();
//            for(int n=i ; n<=j ; n++) {
//                set.add(arr[n]);
//            }
//            list.add(set.size());
//            i++;
//            j++;
//        }
//
//        int[] out = new int[list.size()];
//        int m=0;
//        for(int n : list) {
//            out[m++] = n;
//        }
//
//        return out;

        // efficient way using hashing

        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        // find freq of first k elements

        for(int i=0; i<k ; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        list.add(map.size());


        for(int j=k ; j<arr.length ; j++) {
            if(map.get(arr[j-k]).equals(1)) {
                map.remove(arr[j-k]);
            } else {
                map.put(arr[j-k], map.get(arr[j-k]) -1);
            }
            map.put(arr[j], map.getOrDefault(arr[j], 0) + 1);

            list.add(map.size());
        }

        int[] out = new int[list.size()];
        int m=0;
        for(int n : list) {
            out[m++] = n;
        }

        return out;
    }
}
