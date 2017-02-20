package ua.itea.homeWork03Collections.myTreeSet;

import java.util.Comparator;
import java.util.Iterator;

/**
 * @author vitaliy
 * @version 1.0
 * @since 2/7/17
 */
public class MyTreeSetImpl<E> implements MyTreeSortedSet<E>, Iterable<E>{

    private Node<E> root;
    private Comparator<? super E> comparator;
    private int size = 0;

    public MyTreeSetImpl(Comparator<? super E> comparator) {
        this.comparator = comparator;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean add(E e) {
        Node<E> currentNode = root;
        Node<E> newNode = new Node<>(e);

        if (root != null) {
            while (newNode.parent == null) {
                int comp = comparator.compare(newNode.element, currentNode.element);
                if (comp < 0) {
                    if (currentNode.left == null) {
                        newNode.parent = currentNode;
                        currentNode.left = newNode;
                        ++size;
                        return true;
                    } else {
                        currentNode = currentNode.left;
                    }

                } else if (comp > 0) {
                    if (currentNode.right == null) {
                        newNode.parent = currentNode;
                        currentNode.right = newNode;
                        ++size;
                        return true;
                    } else {
                        currentNode = currentNode.right;
                    }
                } else {
                    return false;
                }
            }
        } else {
            root = newNode;
            size = 1;
            return true;
        }
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public Comparator<? super E> comparator() {
        return null;
    }

    private final class Node<E>{
        E element;
        Node<E> left;
        Node<E> right;
        Node<E> parent;

        Node(E element){
            this.element = element;
        }

    }

    @Override
    public Iterator<E> iterator() {
        Iterator<E> it = new Iterator<E>() {

            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < size;
            }

            @Override
            public E next() {
                return null;
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
        return it;
    }

    private Node<E> getFirstNode(){
        Node<E> node = root;
        if (node != null) {
            while (node.left != null) {
                node = node.left;
            }
        }
        return node;
    }

    private Node<E> getLastNode(){
        Node<E> node = root;
        if (node != null) {
            while (node.right != null) {
                node = node.right;
            }
        }
        return node;
    }

    public void inorderTreeWalk(Node<E> node){
        if (node != null) {
            inorderTreeWalk(node.left);
            System.out.println(node.element.toString());
            inorderTreeWalk(node.right);
        }
    }

    public void showAllElements(){
        inorderTreeWalk(root);
    }

    public E getFirsElement(){
        return getFirstNode().element;
    }

    public E getLastElement(){
        return getLastNode().element;
    }


    //TODO make it work
    public String toString(){
        String allElements = "[";

        return allElements;
    }

}
