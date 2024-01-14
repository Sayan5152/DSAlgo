public class ReverseEachWordInString {
    public static void main(String args[]) {
        String s = "Ipshita is my beautiful wife";
        System.out.println(reverseEachWord(s));
    }

    private static String reverseEachWord(String s) {
        String reversed = "";
        String[] arr = s.split(" ");
        for(String str : arr) {
            String rev = "";
            for(int i=str.length()-1 ; i>=0 ; i--) {
                rev += str.charAt(i);
            }
            reversed += rev + " ";
        }
        return reversed;
    }
}
