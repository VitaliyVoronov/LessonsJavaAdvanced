package ua.itea.homeWork02Generics;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author vitaliy
 * @version 1.0
 * @since 1/31/17
 */
public class Array<T> implements Serializable{

    private List<T> list;

    public Array(){
        list = new ArrayList<>();

    }

    public void add(T e){
        list.add(e);
    }

    public T get(int index){
        return list.get(index);
    }

    public int size(){
        return list.size();
    }

    public static <T extends Number & Comparable> int countLowerElementsFromArray(T[] arr, T element){
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            if(arr[i].compareTo(element) == -1){
                ++count;
            }
        }
        return count;
    }
    //TODO make it works good
    public List sortAndMinus(List<? extends Number> arr){
        List<Double> list = new ArrayList<>();

        double average = 0;
        for (int i = 0; i < arr.size(); i++){
            average += arr.get(i).shortValue();
        }
        average /= arr.size();
        System.out.println();
        System.out.println("count: "+average);

        int arrSize = arr.size();
        for (int i = 0; i < arrSize; i++){
            double temp = arr.get(i).doubleValue() - average;
            list.add(i,temp);
        }
        System.out.println();
        Collections.sort(list);
        return list;
    }

    public String toString(){
        return list.toString();
    }

}
