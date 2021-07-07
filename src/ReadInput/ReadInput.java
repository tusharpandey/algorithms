package ReadInput;

import util.Utility;

import java.util.Scanner;

public class ReadInput {
    public static void main(String[] args) {
        ReadInput object = new ReadInput();
        object.process();
    }

    private void process() {
        System.out.println("input array Size");
        Scanner sc = new Scanner(System.in);
        int arraySize = sc.nextInt();
        System.out.println("input " + arraySize + " items in array");
        int array[] = new int[arraySize];
        for(int i=0;i<arraySize;i++){
            array[i] = sc.nextInt();
        }
        Utility.printArray(array);
    }

}
