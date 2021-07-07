package array;

import util.Utility;

public class Palindrome {
    public static void main(String args[]) {
        String string = "ramar";
        int stringLength = string.length();
        int count = 0;
        boolean isPalindrome = true;
        while (count != stringLength / 2) {
            if (string.charAt(count) != string.charAt(stringLength - 1 - count)) {
                isPalindrome = false;
            }
            count++;
        }
        Utility.print("isPalindrome : " + isPalindrome);
    }
}
