public class TestPalindrome {
    public static void main(String args[]) {
        TestPalindrome object = new TestPalindrome();
        object.process("CICVI");
    }

    public void process(String input) {
        boolean result = isReverseSame(input);

        System.out.println(input + " is palindrome : " + result);
    }

    public boolean isReverseSame(String string) {
        String reverse = "";
        for (int i = string.length() - 1; i >= 0; i--) {
            reverse = reverse + string.charAt(i);
        }

        boolean result = string.equals(reverse);

        if (!result) {
            int counterOfOddCounts = 0 ;
            for (int i = 0; i < string.length(); i++) {
                int countOfCharacter = 0 ;
                for (int j = i; j < string.length(); j++) {
                    if(string.charAt(i) == string.charAt(j)){
                        countOfCharacter ++ ;
                    }
                }
                if(countOfCharacter%2!=0){
                    counterOfOddCounts ++;
                }
                if(counterOfOddCounts==1){
                    return false;
                }
            }
            return true;
        } else {
            return result;
        }
    }
}
