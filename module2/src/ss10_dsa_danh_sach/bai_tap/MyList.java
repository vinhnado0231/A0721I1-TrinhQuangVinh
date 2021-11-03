package ss10_dsa_danh_sach.bai_tap;

import java.util.Arrays;

public class MyList<E> {
    int size = 0;
    static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }


    public void add(int index, E e) {
        if (index >= 0 && index <= size) {
            System.arraycopy(elements, index, elements, index + 1, size - index);
            elements[index] = e;
            size++;
        } else {
            System.out.println("Out of bound");
        }
    }

    public void remove(int index) {
        if (size - index >= 0) {
            System.arraycopy(elements, index + 1, elements, index, size - index);
        }
        size--;
    }

    int size() {
        return size;
    }

    public E clone() {
        return (E) elements;
    }

    boolean contains(E o) {
        for (int i = 0; i < size; i++) {
            if (elements[i] == o) {
                return true;
            }
        }
        return false;
    }

    int indexOf(E o) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (elements[i] == o) {
                return i;
            }
        }
        return index;
    }

    boolean add(E e) {
        if (size == DEFAULT_CAPACITY) {
            ensureCapacity();
        } else {
            elements[size] = e;
            size++;
        }
        return true;
    }

    public void ensureCapacity() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    E get(int i) {
        return (E) elements[i];
    }

    public void clear() {
        size = 0;
        Arrays.copyOf(elements, size);
    }
}
