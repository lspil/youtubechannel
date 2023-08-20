package org.example;

public class AList {

    private int[] list;
    private int size;

    public AList() {
        list = new int[10];
        size = 0;
    }

    public void add(int value) {
        if (size == list.length) {
            int[] newList = new int[size * 2];
            for (int i = 0; i < size; i++) {
                newList[i] = list[i];
            }
            list = newList;
        }
        list[size] = value;
        size++;
    }

    public void set(int index, int value) {
        try {
            if (index < size) {
                list[index] = value;
            } else {
                throw new IndexOutOfBoundsException();
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new IndexOutOfBoundsException();
        }
    }

    public int get(int index) {
        try {
            if (index < size) {
                return list[index];
            } else {
                throw new IndexOutOfBoundsException();
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new IndexOutOfBoundsException();
        }
    }

    public void remove(int index) {
        try {
            if (index < size) {
                for (int i = index; i < size - 1; i++) {
                    list[i] = list[i + 1];
                }

                list[size - 1] = 0;
                size--;
            } else {
                throw new IndexOutOfBoundsException();
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new IndexOutOfBoundsException();
        }
    }

    public void insert(int index, int value) {
        try {
            if (index < size) {
                if (size == list.length) {
                    int[] newList = new int[size * 2];
                    for (int i = 0; i < size; i++) {
                        newList[i] = list[i];
                    }
                    list = newList;
                }
                for (int i = size; i > index; i--) {
                    list[i] = list[i - 1];
                }
                list[index] = value;
                size++;
            } else {
                throw new IndexOutOfBoundsException();
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new IndexOutOfBoundsException();
        }
    }

}
