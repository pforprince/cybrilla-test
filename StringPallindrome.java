package ArraysEx;

import java.util.Scanner;

public class StringPallindrome {

    public boolean isPallindrome(String st) {
        int len = st.length();
        String rev = "";
        for (int i = len - 1; i >= 0; i--) {
            rev = rev + st.charAt(i);
        }
        if (st.equals(rev)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String args[]) {
        String st;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your string:");
        st = scanner.nextLine();
        StringPallindrome stringPallindrome = new StringPallindrome();
        System.out.println(stringPallindrome.isPallindrome(st) ? "It is a pallindrome" : "Not a pallindrome");
    }
}
