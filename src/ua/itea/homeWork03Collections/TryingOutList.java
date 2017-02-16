package ua.itea.homeWork03Collections;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * TryingOutList. Работа с ArrayList через интерфейс List.
 * Написать свой метод  asList(..) для конвертации массива строк, чисел в список.
 * Написать метод printRm(..), который создаст список (List) чисел, положит в него 10 элементов,
 * затем удалит первые 3 и последний, а затем выведет результат на экран.
 * @author vitaliy
 * @version 1.0
 * @since 2/2/17
 */

public class TryingOutList<T> {

    public static  <T> void asList(T[] arr, List<T> list){
        // Arrays.asList(arr);
        for (int i = 0; i < arr.length; i++){
            list.add(arr[i]);
        }
    }

    public static void printRm(){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            list.add(100 + (int)(Math.random() * ((100 - 1) + 1)));
        }
        for (int i = 0; i < 3; i++) {
            list.remove(i);
        }

        list.remove(list.size()-1);
        for (int i: list){
            System.out.println(i);
        }

    }
}

