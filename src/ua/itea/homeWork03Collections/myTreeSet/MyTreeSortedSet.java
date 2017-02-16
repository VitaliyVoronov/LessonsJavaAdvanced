package ua.itea.homeWork03Collections.myTreeSet;

import java.util.Comparator;

/**
 * @author vitaliy
 * @version 1.0
 * @since 2/10/17
 */
public interface MyTreeSortedSet<E> {

    int size();
    boolean add(E e);
    boolean remove(Object o);
    Comparator<? super E> comparator();

}
