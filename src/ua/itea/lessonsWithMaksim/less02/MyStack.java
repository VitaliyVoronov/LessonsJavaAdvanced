package ua.itea.lessonsWithMaksim.less02;

/**
 * Created by vitaliy on 11/24/16.
 *
 * How would you design a stack which, in addition to push and pop,
 * also has a function min which returns the minimum
 *element? Push, pop and min should all operate in O(1) time.
 */
public class MyStack {

    private int[] array;
    private int index = -1;
    private int min = 0;

    MyStack(int num){
        array = new int[num];
    }

    public void push(int i){
        array[++index] = i;
        min = min > i ? i : index == 0 ? i : min;
    }

    public int min(){
        return min;
    }




}
