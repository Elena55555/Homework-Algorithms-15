package com.sky.pro.HW_15_algorithms_second;

public interface StringList {
    String add1(String item);

    String add2(int index, String item);

    String set(int index, String item);

    String remove1(String item);

    String remove2(int index);

    boolean contains(String item);
    boolean contains2(int[] arr, int element);

    int indexOf(String item);

    int lastIndexOf(String item);

    String get(int index);

    boolean equals(StringList otherList);

    int size();

    boolean isEmpty();

    void clear();

    String[] toArray();
}
