import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class ReverseLinkedListIgnoreSpecialChar {

    public static void main(String args[]) {
        LinkedList<Character> list = new LinkedList<>();
        list.add('g');
        list.add('@');
        list.add('e');
        list.add('#');
        list.add('e');
        list.add('$');
        list.add('k');
        list.add('s');

        reverseListIgnoreSpecialChar(list);
    }

    private static void reverseListIgnoreSpecialChar(LinkedList<Character> list) {
        LinkedList<Character> charList = new LinkedList<>();
        LinkedList<Character> output = new LinkedList<>();
        for(Character c : list) {
            if(Character.isAlphabetic(c)) {
                charList.add(c);
            }
        }

//        reverseList(charList);
        Collections.reverse(charList);

        for(Character c : list) {
            if(Character.isAlphabetic(c)) {
                output.add(charList.pop());
            } else {
                output.add(c);
            }
        }

        System.out.println(output);

    }

//    private static void reverseList(LinkedList<Character> charList) {
//        Character cur = charList.getFirst();
//        Character prev = null;
//
//        while(cur != null) {
//            Character temp = cur.
//        }
//    }
}
