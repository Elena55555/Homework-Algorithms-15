package com.sky.pro.HW_15_algorithms_second;


public interface IntegerList {
    /**
     * Быстрая сортировка
     */
    static void quickSort(Integer[] arr, int begin, int end) {
        if (begin < end) {
            int partitionIndex = IntegerListImpl.partition(arr, begin, end);

            quickSort(arr, begin, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, end);
        }
    }

    /**
     * Сортировка слиянием: вторая стадия
     */
    static void merge(Integer[] arr, Integer[] left, Integer[] right) {

        int mainP = 0;
        int leftP = 0;
        int rightP = 0;
        while (leftP < left.length && rightP < right.length) {
            if (left[leftP] <= right[rightP]) {
                arr[mainP++] = left[leftP++];
            } else {
                arr[mainP++] = right[rightP++];
            }
        }
        while (leftP < left.length) {
            arr[mainP++] = left[leftP++];
        }
        while (rightP < right.length) {
            arr[mainP++] = right[rightP++];
        }
    }

    /**
     * Сортировка слиянием: первая стадия
     */
    static void mergeSort(Integer[] arr) {
        if (arr.length > 1) {
            return;
        }
        int mid = arr.length / 2;
        Integer[] left = new Integer[mid];
        Integer[] right = new Integer[arr.length - mid];

// for (int i = 0; i < left.length; i++) {
// left[i] = arr[i];
//        }
//
// for (int i = 0; i < right.length; i++) {
// right[i] = arr[mid + i];
//        }
        System.arraycopy(arr, 0, left, 0, mid);
        System.arraycopy(arr, mid, right, 0, arr.length - mid);

        mergeSort(left);
        mergeSort(right);

        merge(arr, left, right);
    }

    boolean contains(Integer item, String Inspection_Selection_Bubbles_QuickSort_MergeSort);

    Integer add(Integer item);

    Integer add(int index, Integer item);

    Integer set(int index, Integer item);

    Integer remove(Integer item);

    Integer remove(int index);

    int indexOf(Integer item);

    int lastIndexOf(Integer item);

    Integer get(int index);

    boolean equals(IntegerList otherList);

    int size();

    boolean isEmpty();

    void clear();

    Integer[] toArray();

    void validateItem(Integer item);

    void grow();

    @Override
    String toString();

    IntegerList integerListCopy(IntegerList list);

    Integer[] getStorage();
}
