package queue;

import array.ArrayCreation;
import util.Utility;

import java.util.ArrayList;

public class Queue {
    ArrayList<Integer> queue = new ArrayList<>();

    public static void main(String args[]) {
        Utility.print("======= START ======");
        Utility.print("Queue is ");
        Queue object = new Queue();

        object.push(Utility.getRandom());
        object.push(Utility.getRandom());
        object.push(Utility.getRandom());
        object.push(Utility.getRandom());
        object.push(Utility.getRandom());

        object.showQueue();
        Utility.printNewLine();
        object.pop();
        object.pop();
        object.showQueue();
    }

    public void showQueue(){
        for(int i = 0 ;i < queue.size() ; i ++ ){
            System.out.print(queue.get(i)+", ");
        }
    }

    public void push(int value) {
        queue.add(value);
    }

    public void pop() {
        queue.remove(getStart());
    }

    public int getStart(){
        return 0;
    }

    public int getEnd(){
        return queue.size();
    }
}
