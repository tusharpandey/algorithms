package mods;

public class DecimalToBinary {

    public static void main(String[] args) {
        DecimalToBinary object = new DecimalToBinary();
        object.process();
    }

    String binaryString = "";
    public void process(){
        int input = 5;
        while (input>0){
            int mod = input%2;
            binaryString = binaryString + mod;
            input = input/2;
        }
        int countOf1 = 0 ;
        for (int i = binaryString.length() - 1 ; i >= 0 ; i--){
            System.out.print(binaryString.charAt(i));
            if(binaryString.charAt(i) == '1'){
                countOf1++;
            }
        }
        System.out.println("\ncount of 1 : " + countOf1);
        System.out.println("count of 0 : " + (binaryString.length()-countOf1));
    }
}
