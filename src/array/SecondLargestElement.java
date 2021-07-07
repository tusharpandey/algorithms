package array;

public class SecondLargestElement {
    int array[] = {3, 1, 4, 57, 2};

    public static void main(String args[]) {
        SecondLargestElement object = new SecondLargestElement();
        object.process();
    }

    public void process() {
        int maxElement = -1;
        int secMaxElement = -1;

        for (int i = 0; i < array.length; i++) {

            if(array[i] > maxElement){
                secMaxElement = maxElement;
                maxElement = array[i];
            }
            if(array[i] < maxElement && secMaxElement < array[i]){
                secMaxElement = array[i];
            }
        }

        System.out.println("second max element : " + secMaxElement);
    }
}
