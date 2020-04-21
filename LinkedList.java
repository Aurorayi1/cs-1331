//I worked on the homework assignment alone, using only course materials.
import java.util.NoSuchElementException;
/**
 * This class represents a LinkedList
 * @author Wenye Yi
 * @version 1.0
 * @param <T> type T
 */
public class LinkedList<T> implements SimpleList<T> {
    private Node<T> head;
    private int size;
    /**
     * Create a LinkedList constructor
     */
    public LinkedList() {
        head = null;
        size = 0;
    }
    @Override
    /**
     * This addAtIndex method taking two parameters
     * @param data T type data
     * @param index integer index of the list
     */
    public void addAtIndex(T data, int index) {
        Node<T> temp = head;
        if (index < 0 || index > size) {
            throw new IllegalArgumentException();
        } else if (index == 0) {
            Node<T> newNode = new Node<>(data, head);
            //insert new head in front of the old head
            head = newNode;
            //size++;//change size
        } else if (index == size) {
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(new Node(data, null));
        } else {
            for (int i = 1; i < index; i++) {
                temp = temp.getNext();
                //moving forward by one step every time
            }
            Node<T> newNode = new Node<>(data, temp.getNext());
            temp.setNext(newNode);
        }
        size++;
    }
    /**
     * This removeAtIndex method taking one parameter
     * @param index index of the list
     * @return data
     */
    public T removeAtIndex(int index) {
        if (size == 0) {
            throw new NoSuchElementException();
        } else if (index < 0 || index >= size) {
        // the size'th thing is null, cannot return, but can set to something not sull
            throw new IllegalArgumentException();
        } else {
            if (index == 0) {
                T data = head.getData();
                head = head.getNext();
                size--;
                return data;
            } else {
                Node<T> temp = head;
                for (int i = 0; i < index - 1; i++) {
                    temp = temp.getNext();
                }
                T data = temp.getNext().getData();
                temp.setNext(temp.getNext().getNext());
                size--;
                return data;
            }
        }
    }
    @Override
    /**
     * This get method taking one parameter
     * @param index index of the list
     * @return the data
     */
    public T get(int index) {
        if (size == 0) {
            throw new NoSuchElementException();
        } else if (index < 0 || index >= size) {
        // the size'th thing is null, cannot return, but can set to something not sull
            throw new IllegalArgumentException();
        } else {
            Node<T> temp = head; // go from the beginning
            for (int i = 0; i < index; i++) {
                temp = temp.getNext();
            }
            if (index == 0) {
                return temp.getData();
            } else {
                T data = removeAtIndex(index - 1);
                addAtIndex(data, index);
                return temp.getData();
            }
        }
    }
    @Override
    /**
     * a boolean method called contains
     * @param element element in the list
     * @return true or false
     */
    public boolean contains(T element) {
        Node<T> temp = head;
        for (int i = 0; i < size; i++) {
            if (temp.getData() == element) {
                return true;
            }
            temp = temp.getNext();
        }
        return false;
    }
    @Override
    /**
     * a boolean method called isEmpty
     * @return size is 0
     */
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    /**
     * a size method
     * @return size
     */
    public int size() {
        return size;
    }

    @Override
    /**
     * a toArray method
     * @return the array
     */
    public T[] toArray() {
        // TODO Auto-generated method stub
        T[] arr = (T[]) new Object[size];
        Node<T> temp = head;
        for (int i = 0; i < size; i++) {
            arr[i] = temp.getData();
            temp = temp.getNext();
        }
        return arr;
    }
}