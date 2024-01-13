import java.util.*;
import java.util.stream.Collectors;

public class SortByFrequency {
    public static void main(String args[]) {
        int arr[] = new int[]{1,2,2,6,6,6,4,4,5,5,5,5,3,3,3,7,8,9,10};
        sortByFrequency(arr);
    }

    public static void sortByFrequency(int[] arr) {
        Map<Integer, Integer> map = new LinkedHashMap<>();

        for(int i : arr) {
            if(map.containsKey(i)) {
                map.put(i, map.get(i)+1);
            }
            else {
                map.put(i,1);
            }
        }

//        System.out.println(Arrays.asList(map));

        Map<Integer, Integer> temp = map.entrySet().stream().sorted((i1, i2)
                        -> i2.getValue().compareTo(
                        i1.getValue()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1, LinkedHashMap::new));

//        System.out.println(Arrays.asList(temp));
        List<Integer> output = new ArrayList<>();

        for(Map.Entry<Integer,Integer> m : temp.entrySet()) {
            for(int i=0 ; i<m.getValue() ; i++) {
                output.add(m.getKey());
            }
        }

        for (int i : output)
            System.out.print(i);
    }
}
