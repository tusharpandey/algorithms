package util;

public class Test {

    String input = "weNITINwe";

    public static void main(String args[]) {
        Test object = new Test();
        object.process();
    }

    void process() {
        String result = reverseOfString(input);
        if (input.equals(result)) {
            System.out.println("String is palindrome");
            return;
        } else {
            System.out.println("String is not palindrome");
        }
        findBiggestPalindrome();
    }

    void findBiggestPalindrome() {
        int maxLength = 0;
        String maxPalindrome = "";
        for (int i = 0; i < input.length(); i++) {
            for (int j = input.length() -1 ; j >= i; j--) {
                String subString = input.substring(i,j);
                if(subString.length() < 3) continue;
                String getReverseOfString = reverseOfString(subString);
                if(getReverseOfString.equals(subString)){
                    int length = subString.length();
                    System.out.println(subString + " Substring is palindrome");
                    if(maxLength < length){
                        maxLength = length;
                        maxPalindrome = subString;
                    }
                }
            }
        }
        System.out.println(maxPalindrome + " biggest palindrome");
    }

    String reverseOfString(String parameter) {
        String reverseOfInput = "";
        for (int i = parameter.length() - 1; i >= 0; i--) {
            reverseOfInput = reverseOfInput + parameter.charAt(i);
        }
        return reverseOfInput;
    }
}
