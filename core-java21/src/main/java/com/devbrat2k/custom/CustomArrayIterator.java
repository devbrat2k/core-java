package com.devbrat2k.custom;


import java.util.Iterator;

public class CustomArrayIterator<Type> implements Iterable<Type> {
    private Type[] arrayList;
    private int currentSize;

    public CustomArrayIterator(Type[] newArray) {
        this.arrayList = newArray;
        this.currentSize = arrayList.length;
    }

    @Override
    public Iterator<Type> iterator() {
        Iterator<Type> it = new Iterator<Type>() {
            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < currentSize && arrayList[currentIndex] != null;
            }

            @Override
            public Type next() {
                return arrayList[currentIndex++];
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
        return it;
    }


    // Example usage:
    public static void main(String[] args) {
        Integer[] numbers = new Integer[]{1, 2, 3, 4, 5};
        CustomArrayIterator<Integer> stackOverflowList = new CustomArrayIterator<>(numbers);

        for (Integer num : stackOverflowList) {
            System.out.print(num + " ");
        }
    }
}