package ua.itea.homeWork03Collections;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *
 * QueueWrapper. Написать метод  asList(..) который принимает очередь любых generic элементов Queue,
 * но возвращает список List, при этом изменения вносимые в изначальную очередь отражаются на полученном списке.
 * Например, при удалении элемента из очереди, размер списка должен уменьшится на 1.
 *
 * @author vitaliy
 * @version 1.0
 * @since 2/3/17
 */
public class QueueWrapper {

    public List asList(Queue<?> queue){
        return (LinkedList) queue;
    }
}
