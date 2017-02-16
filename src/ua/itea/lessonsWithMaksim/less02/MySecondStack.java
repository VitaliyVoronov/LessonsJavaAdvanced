package ua.itea.lessonsWithMaksim.less02;

/**
 * Created by vitaliy on 11/28/16.
 */
public class MySecondStack {

    private int[] array;
    private int index = -1;

    public MySecondStack(int num){
        array = new int[num];
    }

    public void push(int i){
        if (index >= 0) {
            int lastElement = array[index];
            if (lastElement < i) {
                array[index] = i;
                array[++index] = lastElement;
            } else {
                array[++index] = i;
            }
        } else {
            array[++index] = i;
        }

    }

    public int pop(){
        int element = array[index];
        --index;
        return element;
    }

    public int min(){
        return pop();
    }
}
