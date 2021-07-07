package array;

public class SmallestMissingNumber {

    int array[] = {1, 2, 3, 5, 6, 7, 8, 9, 10, 11, 12};

    public static void main(String args[]) {
        SmallestMissingNumber object = new SmallestMissingNumber();
        object.process();
    }

    public void process() {
        divide(0, array.length - 1);
    }

    public void divide(int start, int end) {
        if (start < 0 || end > array.length - 1) {
            return;
        }

        if (start == end) {
            System.out.println("value is : " + array[end]);
            return;
        }

        int mid = start + (end - start) / 2;
//        System.out.println("mid is : " + mid);
        divide(start, mid);
        divide(mid+1, end);

    }
}