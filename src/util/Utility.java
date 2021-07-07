package util;

public class Utility {
    public static void print(String message) {
        System.out.println(message);
    }

    public static void print(int message) {
        System.out.println(message);
    }

    public static void printNewLine() {
        System.out.println("\n");
    }

    public static void printArray(int[] array, int top) {
        for (int i = 0; i < array.length && i <= top; i++) {
            System.out.print(array[i] + ", ");
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println("");
    }

    public static int getRandom() {
        int max = 99;
        int min = 1;
        return (int) (Math.random() * (max - min + 1) + min);
    }

    public static int getRandom(int max, int min) {
        return (int) (Math.random() * (max - min + 1) + min);
    }

    public static int[] createArray(int length) {
        int array[] = new int[length == 0 ? 20 : length];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        return array;
    }

    public static int[] createArrayWithMissingElement(int length, int elementToMiss) {
        int array[] = new int[length == 0 ? 20 : length];
        for (int i = 0; i < array.length && i!= elementToMiss; i++) {
            array[i] = i;
        }
        return array;
    }
}
