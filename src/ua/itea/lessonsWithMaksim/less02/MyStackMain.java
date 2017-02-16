package ua.itea.lessonsWithMaksim.less02;

/**
 * Created by vitaliy on 11/27/16.
 */
public class MyStackMain {
    public static void main(String[] args) {
        //MyStack stack = new MyStack(5);
        //MyFirstStack stack = new MyFirstStack(5);
        MySecondStack stack = new MySecondStack(5);
        stack.push(2);
        stack.push(1);
        stack.push(9);
        stack.push(6);
        stack.push(5);

        System.out.println(stack.min());
    }
}
