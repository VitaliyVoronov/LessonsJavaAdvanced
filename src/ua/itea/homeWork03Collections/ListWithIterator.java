package ua.itea.homeWork03Collections;

import java.util.*;

/**
 * Сделать список из 3х елементов, получить итератор,
 * а) удалить первый и последний элемент через ссылку на коллекцию
 * b) закоментировать предидущий вариант и реализовать (а) через ссылку на итератор
 * с) вывести коллекцию через итератор
 * d) вывести в обратном порядке
 * e) у нас список чисел(от 5 до 15), тогда замените среднее число по индексу на максимальное число,
 * а среднее добавляем в конец
 *
 * @author vitaliy
 * @version 1.0
 * @since 2/7/17
 */
public class ListWithIterator {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        int length = (int)(5 + (Math.random() * ((15 - 5) + 1)));
        for (int i = 0; i < length; i++){
            list.add((int)(1 + (Math.random() * ((20 - 1) + 1))));
        }
        System.out.println(list);

//        list.remove(0);
//        list.remove(list.size()-1);
//        System.out.println(list);

//        Iterator iteratorList = list.iterator();
//        int count = 0;
//        int lastIndex = list.size()-1;
//        while (iteratorList.hasNext()){
//            if (count == 0){
//                iteratorList.next();
//                iteratorList.remove();
//            } else if (count == lastIndex){
//                iteratorList.next();
//                iteratorList.remove();
//            } else {
//                iteratorList.next();
//            }
//            ++count;
//        }
//        System.out.println(list);

//        Iterator iteratorList = list.iterator();
//        while (iteratorList.hasNext()){
//            System.out.print(iteratorList.next()+", ");
//        }


//        ListIterator listIterator = list.listIterator();
//        while (listIterator.hasNext()){
//            listIterator.next();
//            if (listIterator.nextIndex() == list.size()-1){
//                listIterator.next();
//                while (listIterator.hasPrevious()){
//                    System.out.print(listIterator.previous()+", ");
//                }
//                break;
//            }
//        }


//        ListIterator<Integer> listIterator = list.listIterator();
//        int max = 0;
//        while (listIterator.hasNext()){
//            int temp = listIterator.next();
//            if (max < temp){
//                max = temp;
//            }
//        }
//        int temp = 0;
//        int count = 0;
//        while (listIterator.hasPrevious()){
//            temp = listIterator.previous();
//            if (count == list.size()/2){
//                listIterator.set(max);
//                break;
//            }
//            ++count;
//        }
//        while (listIterator.hasNext()){
//            listIterator.next();
//        }
//        listIterator.add(temp);
//        System.out.println(list);







        }
}
