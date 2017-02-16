package ua.itea.homeWork03Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * SetMath. Напишите класс с методами принимающими два множества и возвращающими другое множество
 * в соответствии с изображением img-cols-1.(Union, Intersection, Difference)
 * @author vitaliy
 * @version 1.0
 * @since 2/4/17
 */
public class SetMath<T> {

    public Set<T> unionSets(Set<T> first, Set<T> second){
        Set resultSet = new HashSet();
        resultSet.addAll(first);
        resultSet.addAll(second);
        return resultSet;
    }

    public Set<T> intersectionSet(Set<T> firstSet, Set<T> secondSet){
        Set resultSet = new HashSet();
        Iterator iteratorFirstSet = firstSet.iterator();
        while (iteratorFirstSet.hasNext()){
            Object obj = iteratorFirstSet.next();
            if (secondSet.contains(obj)){
                resultSet.add(obj);
            }
        }
        return resultSet;
    }

    public Set<T> differenceSet(Set<T> firstSet, Set<T> secondSet){
        Set resultSet = new HashSet();
        Iterator iteratorFirstSet = firstSet.iterator();
        while (iteratorFirstSet.hasNext()){
            Object obj = iteratorFirstSet.next();
            if (!secondSet.contains(obj)){
                resultSet.add(obj);
            }
        }
        Iterator iteratorSecondSet = secondSet.iterator();
        while (iteratorSecondSet.hasNext()){
            Object obj = iteratorSecondSet.next();
            if (!firstSet.contains(obj)){
                resultSet.add(obj);
            }
        }
        return resultSet;
    }
}
