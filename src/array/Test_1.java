package array;

public class Test_1 {
    int array[] = {13,7,6,12};

    public static void main(String args[]) {
        Test_1 object = new Test_1();
        object.process();
    }

    public void process() {
        int array2[] = new int[array.length];
        int max = -1;

        for (int i = array.length - 1; i > -1; i--) {
            array2[i] = max;

            if (i - 1 < 0) break;

            if (array[i] > array[i - 1]) {
                max = array[i];
            }
        }

        printArray(array2);
    }

    public void printArray(int inputArray[]) {
        for (int i = 0; i < inputArray.length; i++) {
            System.out.println(inputArray[i]);
        }
    }
}
