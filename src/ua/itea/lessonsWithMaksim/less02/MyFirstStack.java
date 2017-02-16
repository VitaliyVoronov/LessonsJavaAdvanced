package ua.itea.lessonsWithMaksim.less02;

/**
 * Created by vitaliy on 11/27/16.
 */
public class MyFirstStack {

    private int[] array;
    private int index = -1;

    MyFirstStack(int num){
        array = new int[num];
    }

    public void push(int i){
        array[++index] = i;
    }

    public int pop(){
        return index >= 0 ? array[index--] : -1;
    }

    public int min(){
        int tempIndex = index;
        int min = pop();
        while (tempIndex>=0){
            int temp = array[tempIndex];
            min = min > temp ? temp : min;
            --tempIndex;
        }
        return min;
    }
}
