package array;

public class TrappingRainWater {

    //    int array[] = {3, 0, 2, 0, 1};
    int array[] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};

    public static void main(String args[]) {
        TrappingRainWater object = new TrappingRainWater();
        object.process();
    }

    public void process() {
        int counter = 0;
        int capacity = 0;

        while (counter < array.length) {

            int currentValue = array[counter];
            int prevMaxValue = findMaxToTheLeft(counter);
            int nextMaxValue = findMaxToTheRight(counter);

            if (counter == 0 || counter == array.length - 1) {
                counter++;
                continue;
            }
            if (currentValue > prevMaxValue && currentValue > nextMaxValue) {
                counter++;
                continue;
            }
            capacity = capacity + (prevMaxValue > nextMaxValue ? nextMaxValue : prevMaxValue);
            capacity = capacity - currentValue;
            counter++;
        }

        System.out.println("capacity : " + capacity);
    }

    public int findMaxToTheLeft(int index) {
        int max = array[index];
        for (int i = index - 1; i >= 0; i--) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public int findMaxToTheRight(int index) {
        int max = array[index];
        for (int i = index; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

}
