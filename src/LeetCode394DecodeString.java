import java.util.Stack;

public class LeetCode394DecodeString {
    public String decodeString(String s) {
        StringBuilder out = new StringBuilder();

        Stack<Character> stack = new Stack<>();
        int count = 0;

        for(Character c : s.toCharArray()) {

            if(c.toString().matches("[0-9]")) {
                stack.push(c);
            }
            else if (c == '[') {
                count = Integer.valueOf(stack.pop()) - '0';
            }
            else if(c.toString().matches("[a-z]")) {
                stack.push(c);
            }
            if(c == ']') {
                StringBuilder sb = new StringBuilder();
                while(!stack.isEmpty()) {
                    sb.append(stack.pop());
                }
                sb.reverse();
                for(int i=0 ; i<count ; i++) {
                    out.append(sb);
                }

                count = 0;
            }
        }

        return out.toString();
    }
}
