package array;

import util.Utility;

public class FindMissingNumber {

    int array[] = {1, 2, 3, 4, 6, 7, 8, 9, 10};

    public static void main(String args[]) {
        FindMissingNumber object = new FindMissingNumber();
        object.process();
    }

    public void process() {
        Utility.printArray(array);
        divideArray(0, array.length-1, array);
    }

    int counter = -1;

    private void divideArray(int start, int end, int[] array) {

        counter++;

        if (start == end) {
//            Utility.print("start is : " + start + " && end is : " + end);
            Utility.print("end child is : array[" + start + "] = " + array[start]);
            return;
        }


//        Utility.print(counter + " : start is : " + start);
//        Utility.print(counter + " : end is : " + end);
//        Utility.print(counter + " : array is : below  ");
//        Utility.printArray(array);

        int mid = (start + end) / 2;

        divideArray(start, mid, array);
        divideArray(mid + 1, end, array);
    }
}
