import java.util.ArrayList;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");

//        FuncInterface fobj = (int x) -> System.out.println(2 * x);
//
//        ArrayList<Integer> arrL = new ArrayList<Integer>();
//        arrL.add(1);
//        arrL.add(2);
//        arrL.add(3);
//        arrL.add(4);
//
//        // calling lambda expression to call abstract method from functional interface - Consumer
//        arrL.forEach(x -> System.out.println(x));
//        System.out.println();
//
//        arrL.forEach(x -> {
//            if (x % 2 == 0) {
//                System.out.println(x);
//            } else {
//                System.out.println(x * 3);
//            }
//        });
//
//        // calling abstract method from functional interface FuncInterface
//        fobj.abstractFun(5);
//        fobj.defaultFun();
        LeetCode394DecodeString leetCode394DecodeString = new LeetCode394DecodeString();
        System.out.println(leetCode394DecodeString.decodeString("3[a]2[bc]"));
    }
}
