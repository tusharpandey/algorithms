package array;

public class MatrixRotate90Degree {

    private static int X = 4;
    private static int Y = 4;

    int array[][] = new int[X][Y];
    int transposeArray[][] = new int[X][Y];
    int reverseArray[][] = new int[X][Y];
    int counter = 10;

    public static void main(String args[]) {
        MatrixRotate90Degree object = new MatrixRotate90Degree();
        object.process();
    }

    public void fillDataInMatrix() {
        for (int i = 0; i < X; i++) {
            for (int j = 0; j < Y; j++) {
                array[i][j] = i + j + counter;
            }
            counter = counter + 10;
        }
    }

    public void printMatrix(int array[][]) {
        for (int i = 0; i < X; i++) {
            for (int j = 0; j < Y; j++) {
                System.out.print(array[i][j] + (j < Y - 1 ? "," : ""));
            }
            System.out.println();
        }
    }

    public void process() {
        System.out.println("Normal Matrix");
        fillDataInMatrix();
        printMatrix(array);
        System.out.println("=====================");
        System.out.println("Transpose Matrix");
        transposeMatrix();
        printMatrix(transposeArray);
        System.out.println("=====================");
        System.out.println("Reverse Matrix");
        reverseMatrix();
        printMatrix(reverseArray);
    }

    public void transposeMatrix() {
        for (int i = 0; i < X; i++) {
            for (int j = 0; j < Y; j++) {
                transposeArray[j][i] = array[i][j];
            }
        }
    }

    public void reverseMatrix() {
        for (int i = 0; i < X; i++) {
            int counter = 0;
            for (int j = Y-1; j >= 0; j--) {
                reverseArray[i][counter++] = transposeArray[i][j];
            }
        }
    }
}
