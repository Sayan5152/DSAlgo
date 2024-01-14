import java.util.HashMap;
import java.util.Stack;

public class ValidParenthesis {
    public static void main(String arg[]) {
        String s = "([)]";
        System.out.println(isValidParenthesis(s));
    }

    private static boolean isValidParenthesis(String s) {
        boolean isValid = false;
        HashMap<Character,Character> map = new HashMap<>();
        map.put('}', '{');
        map.put(']','[');
        map.put(')','(');
        Stack<Character> stack = new Stack<>();
        int i=0;
        while(i<s.length()) {
            if(s.charAt(i)=='{' || s.charAt(i)=='[' || s.charAt(i)=='(') {
                stack.push(s.charAt(i));
            }
            else if(stack.isEmpty() || map.get(s.charAt(i)) != stack.pop()) {
                return false;
            }
            i++;
        }

        return stack.isEmpty();
    }
}
