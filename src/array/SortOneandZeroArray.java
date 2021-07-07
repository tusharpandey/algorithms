package array;

import util.Utility;

public class SortOneandZeroArray {
    public static void main(String args[]) {
        ArrayCreation arrayCreation = new ArrayCreation();
        arrayCreation.fillArray(new int[]{0, 0,1, 1, 0, 0, 1, 1,0});

        int array[] = arrayCreation.getArray();
        Utility.print("input");
        Utility.printArray(array);

        int array2[] = new int[array.length];
        int indexOf0_Insertion = 0;
        int indexOf1_Insertion = array2.length - 1;

        Utility.print("");

        for (int i = 0; i < array.length; i++) {
            if(array[i] == 0){
                array2[indexOf0_Insertion++] = array[i];
            }else{
                array2[indexOf1_Insertion--] = array[i];
            }
        }

        Utility.print("output");
        Utility.printArray(array2);

    }
}
