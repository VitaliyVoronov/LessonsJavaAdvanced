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
    private static final boolean RED   = false;
    private static final boolean BLACK = true;

    public MyTreeSetImpl(Comparator<? super E> comparator) {
        this.comparator = comparator;
    }

    @Override
    public int size() {
        return size;
    }

//    @Override
//    public boolean add(E e) {
//        Node<E> newNode = new Node(e);
//        //Node<E> temp = null;
//        Node<E> position = root;
//        if (root == null){
//            root = newNode;
//            root.color = BLACK;
//            return true;
//        } else {
//            while (position != null) {
//                //temp = position;
//                if (comparator.compare(newNode.element, position.element) < 0) {
//                    position = position.left;
//                } else {
//                    position = position.right;
//                }
//            }
//            position = newNode;
//            newNode.parent = position.parent;
//            if (comparator.compare(newNode.element, position.element) < 0) {
//                position.left = newNode;
//            } else {
//                position.right = newNode;
//            }
//            newNode.color = RED;
//            fixAfterInsert(position);
//            return true;
//        }
//    }
    @Override
    public boolean add(E e) {
        Node<E> currentNode = root;
        Node<E> newNode = new Node<>(e);
        newNode.color = RED;

        if (root != null) {
            while (newNode.parent == null) {
                int comp = comparator.compare(newNode.element, currentNode.element);
                if (comp < 0) {
                    if (currentNode.left == null) {
                        newNode.parent = currentNode;
                        currentNode.left = newNode;
                        ++size;
                        currentNode = currentNode.left;
                        fixAfterInsert(currentNode);
                        return true;
                    } else {
                        currentNode = currentNode.left;
                    }

                } else if (comp > 0) {
                    if (currentNode.right == null) {
                        newNode.parent = currentNode;
                        currentNode.right = newNode;
                        ++size;
                        currentNode = currentNode.right;
                        fixAfterInsert(currentNode);
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
            root.color = BLACK;
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
        boolean color = BLACK;

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

    private void fixAfterInsert(Node<E> position){
        if (comparator.compare(position.parent.element,root.element) != 0) {
            while (position.parent.color == RED) {
                if (comparator.compare(position.parent.element, position.parent.parent.left.element) == 0) {
                    Node temp = position.parent.parent.right;
                    if (temp.color == RED) {
                        position.parent.color = BLACK;
                        temp.color = BLACK;
                        position.parent.parent.color = RED;
                        position = position.parent.parent;
                    } else if (position.equals(position.parent.right)) {
                        position = position.parent;
                        leftTurn(position);
                        position.parent.color = BLACK;
                        position.parent.parent.color = RED;
                        rightTurn(position.parent.parent);
                    }
                } else {
                    Node temp = position.parent.parent.left;
                    if (temp.color == RED) {
                        position.parent.color = BLACK;
                        temp.color = BLACK;
                        position.parent.parent.color = RED;
                        position = position.parent.parent;
                    } else if (position.equals(position.parent.left)) {
                        position = position.parent;
                        leftTurn(position);
                        position.parent.color = BLACK;
                        position.parent.parent.color = RED;
                        rightTurn(position.parent.parent);
                    }

                }
            }
        }
    }

    private void leftTurn(Node position) {
        Node temp = position.right;
        position.right = temp.left;
        if (temp.left != null){
            temp.left.parent = position;
        }
        temp.parent = position.parent;
        if (position.parent == null){
            root = temp;
        } else if (position == position.parent.left){
            position.parent.left = temp;
        } else {
            position.parent.right = temp;
        }
        temp.left = position;
        position.parent = temp;
    }

    private void rightTurn(Node grandpa){
        Node temp = grandpa.right;
        grandpa.right = temp.left;
        if (temp.left != null){
            temp.left.parent = grandpa;
        }
        temp.parent = grandpa.parent;
        if (grandpa.parent == null){
            root = temp;
        } else if (grandpa == grandpa.parent.left){
            grandpa.parent.left = temp;
        } else {
            grandpa.parent.right = temp;
        }
        temp.left = grandpa;
        grandpa.parent = temp;

    }


    //TODO make it work
    public String toString(){
        String allElements = "[";

        return allElements;
    }

}
