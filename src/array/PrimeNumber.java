package array;

import util.Utility;

public class PrimeNumber {
    public static void main(String args[]) {
        PrimeNumber primeNumber = new PrimeNumber();
        primeNumber.biggestPrimeNumber(3);
    }

    public int getBiggestNumber(int limit){
        int counter = 1;
        int biggestValue = 1;
        while (counter <= limit){
            counter++;
            biggestValue = biggestValue * 10;
        }
        return biggestValue;
    }

    public void biggestPrimeNumber(int limit) {
        int biggestNumber = getBiggestNumber(limit);
        while (biggestNumber > 1) {
            boolean isDivisible = false;
            for (int i = 2; i < biggestNumber / 2; i++) {
                if(biggestNumber%i == 0){
                    isDivisible = true;
                }
            }
            if(!isDivisible) break;
            biggestNumber--;
        }
        Utility.print(limit + " digit biggest prime number is : " + biggestNumber);
    }
}
