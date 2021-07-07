package stack;

import util.Utility;

public class Stack {

    int size = 3;
    int array[];
    int top = -1;

    public Stack() {
        array = new int[size];
    }

    public Stack(int size) {
        this.size = size;
        array = new int[size];
    }

    public void push(int number) {
        if (top + 1 >= size) {
            Utility.print(top + " : index , stack over flow");
            return;
        }
        top = top + 1;
        array[top] = number;
    }

    public void pushRandomNumbers() {
        int max = 100;
        int min = 10;
        for (int i = 0; i < size; i++) {
            int random_int = Utility.getRandom(max - min + 1, min);
            top = top + 1;
            array[top] = random_int;
        }
    }

    public void push(int number, int index) {
        if (index >= size) {
            Utility.print(top + " : index , stack over flow");
            return;
        }
        array[index] = number;
    }

    public void pop() {
        if (top < 0) {
            Utility.print(top + " : index , stack is empty");
            return;
        }
        array[top] = 0;
        top = top - 1;
    }

    public void pop(int index) {
        if (index < 0) {
            Utility.print(top + " : index , stack is empty");
            return;
        }
        array[index] = 0;
    }

    public int getSize() {
        return size;
    }

    public int[] getArray() {
        return array;
    }
}
