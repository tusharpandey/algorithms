package array;

import util.Utility;

public class ArrayCreation {

    int size = 5;
    int array[];

    public ArrayCreation() {
        array = new int[size];
    }

    public ArrayCreation(int size) {
        this.size = size;
        array = new int[size];
    }

    public int[] fillArray() {
        int max = 30;
        int min = 0;
        for (int i = 0; i < size; i++) {
            int random_int = (int) (Math.random() * (max - min + 1) + min);
            array[i] = random_int;
        }
        return array;
    }

    public int[] fillArray(int[] arrayRec) {
        array = new int[arrayRec.length];
        for (int i = 0; i < arrayRec.length; i++) {
            array[i] = arrayRec[i];
        }
        return array;
    }

    public int getSize() {
        return size;
    }

    public int[] getArray() {
        return array;
    }

    public void add(int value) {
        array[array.length] = value;
    }

    public void remove(int index) {
        if (index >= size || index < 0) {
            Utility.print(index + "in queue is either bigger or smaller");
            return;
        }
        array[index] = 0;
    }
}
