package JavaStreamPractice;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String args[]) {
        List<String> list = new ArrayList<>();
        list.add("test");
        list.add("panda");
        list.add("rabbit");
        list.add("bruno");
        list.add("dog");

        Stream.of(list);

        // getting a stream of the list and then printing the elements using the forEach operation
        Stream.of(list).forEach(l->System.out.print(l));

        Stream.Builder<String> listBuilder = Stream.builder();

        listBuilder.accept(list.get(0));
        listBuilder.accept(list.get(2));
        listBuilder.accept(list.get(4));

        // to iterate over listBuilder, by first converting it to stream using listBuilder.build()
        // then using the forEach operation
//        listBuilder.build().forEach(l -> System.out.println(l));

//        list.stream().forEach(l -> System.out.println(l));
//        list.stream().forEach(System.out::println);

        list.stream().map(String::valueOf).collect(Collectors.toList())
                .stream().filter(s -> s.equals("bruno"))
                .forEach(System.out::println);

        System.out.println(list.stream().map(String::valueOf)
                .filter(s -> s.equals("pandas"))
                .findFirst().orElse("not a valid animal"));

        List<List<String>> namesNested = Arrays.asList(
                Arrays.asList("Jeff", "Bezos"),
                Arrays.asList("Bill", "Gates"),
                Arrays.asList("Mark", "Zuckerberg"));

        namesNested.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList()).forEach(System.out::println);

        list.stream().sorted((s1,s2) -> s2.compareTo(s1))
                .forEach(System.out::println);

        int[] arr = new int[]{3,2,4,-3,1};
        Arrays.stream(arr).boxed().collect(Collectors.toList())
                .stream().filter(n -> n>2).forEach(System.out::println);
        Arrays.stream(arr).map(m -> m*m).forEach(System.out::println);

        Arrays.stream(arr).filter(n->n<4).map(m->m*m).forEach(System.out::println);
        Arrays.stream(arr).filter(m -> m>2).findFirst();

        Arrays.stream(arr).reduce((first,second)-> first).stream().forEach(System.out::println);

        String str = "Today is the third thursday of the month";

        System.out.println(str.chars().filter(s->s=='t' || s=='T').count());

        int[] nums= new int[]{5,3,3,7,1,5,1,2};

        Arrays.stream(nums).boxed().collect(Collectors.toSet()).forEach(System.out::println);

        Set<Integer> set = new HashSet<>();
        Arrays.stream(nums).boxed().filter(c -> !set.add(c)).collect(Collectors.toList()).forEach(System.out::println);

    }
}
