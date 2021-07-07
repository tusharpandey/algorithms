package stack.questions;

import stack.Stack;
import util.Utility;

public class FindLargestItemInStack {
    public static void main(String args[]) {
        Stack stack = new Stack(10);
        stack.pushRandomNumbers();
        int[] array = stack.getArray();
        int array2[] = new int[stack.getSize()];

        int smallest = array[0];

        Utility.printArray(array);
        Utility.print("");
        for(int i = 0 ; i < array.length ; i++){
            if(array[i]<smallest){
                array2[i] = array[i];
                smallest = array2[i];
            }else{
                array2[i] = smallest;
            }
        }
        Utility.printArray(array2);
    }
}
