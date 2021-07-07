package array;

import util.Utility;

public class SortTwoSortedArray {

    int array1[] = {1, 4, 8, 20};
    int array2[] = {7, 9, 10, 13, 17};
    int array3[] = new int[array1.length + array2.length];

    public static void main(String[] args) {
        SortTwoSortedArray object = new SortTwoSortedArray();
        object.process();
    }

    public void process() {
        int indexOfArray1 = 0;
        int indexOfArray2 = 0;
        int indexOfArray3 = 0;

        while (indexOfArray3 < array3.length) {
            if (indexOfArray1 >= array1.length || indexOfArray2 >= array2.length) {
                break;
            }
            if (array1[indexOfArray1] > array2[indexOfArray2]) {
                array3[indexOfArray3] = array2[indexOfArray2];
                indexOfArray2++;
            } else {
                array3[indexOfArray3] = array1[indexOfArray1];
                indexOfArray1++;
            }
            indexOfArray3++;
        }

        Utility.print("===================================");
        Utility.print("indexOfArray1 is : " + indexOfArray1);
        Utility.print("indexOfArray2 is : " + indexOfArray2);
        Utility.print("indexOfArray3 is : " + indexOfArray3);
        Utility.printArray(array3);

        for (int i = indexOfArray1; i < array1.length; i++) {
            array3[indexOfArray3] = array1[i];
            indexOfArray1++;
            indexOfArray3++;
        }

        for (int i = indexOfArray2; i < array2.length; i++) {
            array3[indexOfArray3] = array2[i];
            indexOfArray2++;
            indexOfArray3++;
        }
        
        Utility.print("===================================");
        Utility.print("indexOfArray1 is : " + indexOfArray1);
        Utility.print("indexOfArray2 is : " + indexOfArray2);
        Utility.print("indexOfArray3 is : " + indexOfArray3);
        Utility.printArray(array3);
    }
}
