package stack.questions;

import stack.Stack;
import util.Utility;

public class RemoveMidofStack {
    public static void main(String args[]) {
        Stack stack = new Stack(10);
        for (int i = 0; i < stack.getSize(); i++) {
            stack.push(i * 10);
        }
        int array[] = stack.getArray();
        Utility.printArray(array);
        Utility.print("");
        int start = 0;
        int indexToLess = 0;
        while (start != array.length) {
            int value = array[start];
            Utility.print("popped value is : " + value + " and start is : " + start);
            stack.pop(start);
            if (start == array.length / 2) {
                indexToLess = 1;
            }
            stack.push(value, start - indexToLess);
            start = start + 1;
        }

        Utility.printArray(array);
    }
}
